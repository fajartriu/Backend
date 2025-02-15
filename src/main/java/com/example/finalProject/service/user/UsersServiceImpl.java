//package com.example.finalProject.service.user;
//
//import com.example.finalProject.model.user.User;
//import com.example.finalProject.repository.user.UserRepository;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//
//import java.security.Principal;
//import java.util.Map;
//import java.util.Optional;
//import java.util.Set;
//
//@RequiredArgsConstructor
//@Service
//public class UsersServiceImpl implements UsersService{
//    private final static Logger logger = LoggerFactory.getLogger(UsersServiceImpl.class);
//    private final UserRepository usersRepository;
////    private final ValidationService validationService;
//    private final AuthenticationServiceImpl authenticationService;
//
//    @Transactional
//    @Override
//    public void deleteUser(Principal principal) {
//        try {
//            User idUser = authenticationService.getIdUser(principal.getName());
//            usersRepository.deleteById(idUser.getId());
//            logger.info("Success delete user");
//        }catch (Exception e){
//            logger.error(e.getMessage());
//        }
//    }
//
//    @Transactional
//    @Override
//    public UsersUpdateResponse updateUser(Principal principal, Map<String, Optional> field) {
//        try {
//            User idUser = authenticationService.getIdUser(principal.getName());
//
//            for (Map.Entry<String, Optional> m : field.entrySet()){
//                String keyFromMap = m.getKey();
//                logger.debug(keyFromMap);
//
//                if (keyFromMap.equals("firstname")){
//                    String obj = m.getValue().toString().replaceAll("^Optional\\[(.*?)\\]$", "$1");
//                    logger.debug(obj);
//                    idUser.setFirstName(obj);
//                }
//
//                if (keyFromMap.equals("lastname")){
//                    String obj = m.getValue().toString().replaceAll("^Optional\\[(.*?)\\]$", "$1");
//                    logger.debug(obj);
//                    idUser.setLastName(obj);
//                }
//
////
//            }
//            usersRepository.save(idUser);
//            logger.info("Success update user");
//
//            return UsersUpdateResponse.builder()
//                    .firstname(idUser.getFirstName())
//                    .lastname(idUser.getLastName())
//                    .build();
//        }catch (Exception e){
//            logger.error(e.getMessage());
//            return null;
//        }
//    }
//
//    private void addRoles(String role, String email){
//        User idUser = authenticationService.getIdUser(email);
//        for (Role roles: idUser.getRoles()){
//            if (!roles.getName().equals(role)){
//                Set<Role> rol = authenticationService.addRole(ERole.valueOf(role));
//                idUser.setRoles(rol);
//                usersRepository.save(idUser);
//            }
//            else {
//
//            }
//        }
//    }
//}
