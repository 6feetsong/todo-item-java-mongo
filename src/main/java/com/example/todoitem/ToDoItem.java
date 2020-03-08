package com.example.todoitem;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ToDoItem {

    @Id
    private String id;
    private String title;
    private boolean done;

}
