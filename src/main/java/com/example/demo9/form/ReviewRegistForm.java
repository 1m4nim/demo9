package com.example.demo9.form;

import java.time.LocalDate;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ReviewRegistForm {

    // Controller側のform.getRestaurantId()に対応
    private Integer restaurantId;

    // Controller側のform.getUserId()に対応
    @NotBlank(message = "ユーザーIDが正しくありません。")
    private String userId;

    @NotNull(message = "訪問日を入力してください。")
    @PastOrPresent(message = "今日以前の日付を入力してください。")
    private LocalDate visitDate;

    @NotNull(message = "評価を入力してください。")
    @Min(value = 1, message = "1-5で指定してください。")
    @Max(value = 5, message = "1-5で指定してください。")
    private Integer rating;

    @NotBlank(message = "コメントを入力してください。")
    @Size(min = 1, max = 128, message = "1文字から128文字で指定してください。")
    private String comment;
}