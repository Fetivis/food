package com.example.food;

import com.example.food.Models.RandomRecipeApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {@GET("recipes/random")
Call<RandomRecipeApiResponse> callRandomRecipe(
                @Query("number") String number,
                @Query("apiKey") String apiKey,
                @Query("tags") List<String> tags
                );
}

