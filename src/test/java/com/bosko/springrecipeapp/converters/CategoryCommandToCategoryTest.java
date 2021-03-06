package com.bosko.springrecipeapp.converters;

import com.bosko.springrecipeapp.commands.CategoryCommand;
import com.bosko.springrecipeapp.domain.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryCommandToCategoryTest {

    public static final Long ID_VALUE = 1L;
    public static final String DESCRIPTION = "decription";
    CategoryCommandToCategory converter;

    @BeforeEach
    void setUp()  {

        converter = new CategoryCommandToCategory();
    }

    @Test
    public void testNullObject()  {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() {
    assertNotNull(converter.convert(new CategoryCommand()));
    }

    @Test
    void convert()  {
        CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(ID_VALUE);
        categoryCommand.setDescription(DESCRIPTION);

        Category category = converter.convert(categoryCommand);

        assertEquals(ID_VALUE, category.getId());
        assertEquals(DESCRIPTION, category.getDescription());
    }
}