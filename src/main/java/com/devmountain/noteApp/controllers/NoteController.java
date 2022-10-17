package com.devmountain.noteApp.controllers;

import com.devmountain.noteApp.dtos.NoteDto;
import com.devmountain.noteApp.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/user/{userId}") //This method is called when an User is called from front end.
    public List<NoteDto> getNotesByUser(@PathVariable Long userId){
        return noteService.getAllNotesByUserId(userId);
    }

    @PostMapping("/user/{userId}")  // here data has been saved to database when an user details submitted frontend
    public void addNote(@RequestBody NoteDto noteDto, @PathVariable Long userId){
         noteService.addNote(noteDto,userId);
    }

    @DeleteMapping("/{noteId}") // To delete data of note when calling from Front end
    public void deleteNoteById(@PathVariable Long noteId){
        noteService.deleteNoteById(noteId);
    }

    @PutMapping // To update data of note when calling from Front end
    public void updateNote(@PathVariable NoteDto noteDto){
        noteService.updateNoteById(noteDto);
    }

    @GetMapping("/{noteId}") // To get data of note when calling from Front end
    public Optional<NoteDto> getNoteById(@PathVariable Long noteId){
        return noteService.getNoteById(noteId);
    }

}
