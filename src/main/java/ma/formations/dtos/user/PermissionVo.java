package ma.formations.dtos.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PermissionVo implements GrantedAuthority {
    private int id;
    //this field contains the authority, for example : GET_ALL_CUSTUMERS
    private String authority;
}