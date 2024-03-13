package uz.pdp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.config.ApplicationConfig;
import uz.pdp.entity.User;
import uz.pdp.repo.UserRepo;

public class Main {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserRepo userRepo = context.getBean(UserRepo.class);
        User user = userRepo.save(User.builder()
                .username("ali")
                .password("toybola")
                .age(20)
                .build());


        User user1 = userRepo.save(User.builder()
                .username("alisher")
                .password("toybola")
                .age(21)
                .build());



//        userRepo.delete(user1);
        user.setUsername("kamol");
        userRepo.save(user);



        System.out.println(user);
        System.out.println(user1);

        System.out.println("/n all => " + userRepo.findAll());
    }
}