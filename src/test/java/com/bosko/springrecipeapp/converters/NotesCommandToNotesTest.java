package com.bosko.springrecipeapp.converters;

import com.bosko.springrecipeapp.commands.NotesCommand;
import com.bosko.springrecipeapp.domain.Notes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotesCommandToNotesTest {

    public static final Long ID_VALUE = 1L;
    public static final String RECIPE_NOTES = "Notes";
    NotesCommandToNotes converter;

    @BeforeEach
    void setUp() {
        converter = new NotesCommandToNotes();
    }

    @Test
    public void testNullParameter()  {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject()  {
        assertNotNull(converter.convert(new NotesCommand()));
    }

    @Test
    void convert() {

        NotesCommand notesCommand = new NotesCommand();
        notesCommand.setId(ID_VALUE);
        notesCommand.setRecipeNotes(RECIPE_NOTES);

        Notes notes = converter.convert(notesCommand);

        assertNotNull(notes);
        assertEquals(ID_VALUE, notes.getId());
        assertEquals(RECIPE_NOTES, notes.getRecipeNotes());
    }
}