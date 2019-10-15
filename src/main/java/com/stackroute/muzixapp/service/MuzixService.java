package com.stackroute.muzixapp.service;

import com.stackroute.muzixapp.domain.Track;

import java.util.List;

public interface MuzixService {
    public Track saveTrack(Track track);
    public List<Track> displayAllTracks();
    public boolean updateTrack(int trackId,Track track);
    public boolean removeTrack(int trackId);
}
