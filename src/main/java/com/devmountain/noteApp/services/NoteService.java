package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface NoteService {

    // These services are used to execute CRUD SQL call using transactional and methods have been defined here
    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    @Transactional
    void deleteNoteById(Long noteId);

    @Transactional
    void updateNoteById(NoteDto noteDto);

    List<NoteDto> getAllNotesByUserId(Long userId);

    Optional<NoteDto> getNoteById(Long noteId);
}
