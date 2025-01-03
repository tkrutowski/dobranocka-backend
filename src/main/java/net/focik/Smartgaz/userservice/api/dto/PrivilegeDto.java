package net.focik.Smartgaz.userservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.focik.Smartgaz.userservice.domain.Role;
import net.focik.Smartgaz.utils.share.PrivilegeType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivilegeDto {
    private Long id;
    private Long idUser;
    private Role role;
    private PrivilegeType read;
    private PrivilegeType write;
    private PrivilegeType delete;
}
