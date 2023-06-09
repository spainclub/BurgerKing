package com.example.burgerking.dto;

import com.example.burgerking.entity.Menu;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class MenuResponseDto {
    private Long id;
    private String menuName;
    private String category;
    private String imageUrl;
    private LocalDateTime createdDate;

    public MenuResponseDto(Menu menu){
        this.id = menu.getId();
        this.menuName = menu.getMenuName();
        this.category = menu.getCategory();
        this.imageUrl = menu.getImageUrl();
        this.createdDate = menu.getCreatedDate();
    }
}
