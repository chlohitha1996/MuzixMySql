package com.stackroute.Service;

import com.stackroute.Domain.Track;
import com.stackroute.Exceptions.TrackAlreadyExistsException;
import com.stackroute.Exceptions.TrackNotFoundException;

import java.util.List;

public class TrackServiceImpl2 implements TrackService {
    @Override
    public Track savingTrack(Track track) throws TrackAlreadyExistsException {
        return null;
    }

    @Override
    public List<Track> getAllTracksByNameById(String trackName, int trackId) {
        return null;
    }

    @Override
    public String deleteTrack(Track track) throws TrackNotFoundException {
        return null;
    }

    @Override
    public Track searchTrack(Track track) throws TrackNotFoundException {
        return null;
    }

    @Override
    public List<Track> getAllTracks() {
        return null;
    }

    @Override
    public Track updateComment(Track track) throws TrackNotFoundException {
        return null;
    }
}
