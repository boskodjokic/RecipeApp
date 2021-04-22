package com.bosko.springrecipeapp.converters;

import com.bosko.springrecipeapp.commands.IngredientCommand;
import com.bosko.springrecipeapp.domain.Ingredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {

    private final UnitOfMeasureToUnitOfMeasureCommand uomConverter;

    public IngredientToIngredientCommand(UnitOfMeasureToUnitOfMeasureCommand uomConverter) {
        this.uomConverter = uomConverter;
    }

    @Nullable
    @Override
    public IngredientCommand convert(Ingredient source) {

        if(source ==null) {
            return null;
        }

        final IngredientCommand ingredientCommand = new IngredientCommand();
        ingredientCommand.setId(source.getId());
        ingredientCommand.setAmount(source.getAmount());
        ingredientCommand.setDescription(source.getDescription());
        ingredientCommand.setUnitOfMeasure(uomConverter.convert(source.getUom()));

        return ingredientCommand;
    }
}
