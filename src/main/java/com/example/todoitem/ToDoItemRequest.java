package com.example.todoitem;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoItemRequest {

    private String id;
    private String title;
    private boolean isDone;

}
