package com.stackroute.muzixapp.service;

import com.stackroute.muzixapp.domain.Track;
import com.stackroute.muzixapp.repository.MuzixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MuzixServiceImpl implements MuzixService {
    MuzixRepository muzixRepository;

    @Autowired
    public MuzixServiceImpl(MuzixRepository muzixRepository) {
        this.muzixRepository = muzixRepository;
    }


    @Override
    public Track saveTrack(Track track) {
        Track saveTrack = muzixRepository.save(track);
        return saveTrack;
    }

    @Override
    public List<Track> displayAllTracks() {
        return muzixRepository.findAll();
    }

    @Override
    public boolean updateTrack(int trackId,Track track) {
        track.setTrackId(trackId);
            return true;
    }
    @Override
    public boolean removeTrack(int trackId) {
        muzixRepository.deleteById(trackId);
        return true;
    }
}
