package net.focik.Smartgaz.userservice.domain.port.primary;


import net.focik.Smartgaz.userservice.domain.AppUser;

import java.util.List;

public interface IUserService {

    AppUser addNewUser(String firstName, String lastName, String username, String password, String email,
                       boolean enabled, boolean isNotLocked);

    AppUser updateUser(Long id, String newFirstName, String newLastName, String newUsername, String newEmail);

    AppUser findUserByUsername(String username);

    AppUser findUserById(Long id);

    AppUser findUserByEmail(String email);

    List<AppUser> getUsers();

    void deleteUser(Long id);

    //    void resetPassword(String email);
    void changePassword(Long idUser, String currentPassword, String newPassword);

    AppUser saveUser(AppUser user);

    void updateIsActive(Long id, boolean isActive);

    void updateIsLock(Long id, boolean isLock);
//    void updateRole(String currentUser, Collection<Role> roles);

}
