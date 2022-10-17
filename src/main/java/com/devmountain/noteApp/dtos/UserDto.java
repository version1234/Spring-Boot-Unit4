
// This is data object, we use this to transfer data from one object to other

package com.devmountain.noteApp.dtos;

import com.devmountain.noteApp.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    private Long id;
    private String username;
    private String password;
    private Set<NoteDto> noteDtoSet = new HashSet<>();

    public UserDto(User user) {
        if (user.getId() != null) {
            this.id = user.getId();
        }
        if (user.getUsername() != null) {
            this.username = user.getUsername();
        }
        if (user.getPassword() != null){
            this.password = user.getPassword();
        }
    }
//    public UserDto (Long id1, String username1, String password1){
//        this.id = id1;
//        this.username = username1;
//        this.password = password1;
//    }
}
