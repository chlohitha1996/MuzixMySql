package com.stackroute.Service;


import com.stackroute.Domain.Track;
import com.stackroute.Exceptions.TrackAlreadyExistsException;
import com.stackroute.Exceptions.TrackNotFoundException;
import com.stackroute.Repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@Primary
public class TrackServiceImpl implements TrackService {
    TrackRepository trackRepository;

@Autowired
    public TrackServiceImpl(TrackRepository trackRepository){
        this.trackRepository=trackRepository;
    }



    @Override
    public Track savingTrack(Track track) throws TrackAlreadyExistsException {
        Track saveTrack = null;
        if (trackRepository.existsById(track.getTrackId())) {
            throw new TrackAlreadyExistsException("Track Already Exists");
        } else {
            saveTrack = trackRepository.save(track);
            if (saveTrack == null) {
                throw new TrackAlreadyExistsException("Track Does not Exists");
            }
            return saveTrack;
        }
    }



    @Override
    public List<Track> getAllTracksByNameById(String trackName, int trackId) throws ResponseStatusException {
        if (trackRepository.existsById(trackId)) {
            return trackRepository.findAll();
        }
        return null;
    }



    @Override
    public String deleteTrack(Track track) throws TrackNotFoundException {

        if (trackRepository.existsById(track.getTrackId())) {
            trackRepository.deleteById(track.getTrackId());
           return  "Track Found and Deleted";
        }
        else{
            throw new TrackNotFoundException("track not found");
        }

    }

    @Override

    public Track searchTrack(Track track) {

        if (trackRepository.existsById(track.getTrackId())) {
            return track;
        } else {
            return null;
        }
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public Track updateComment(Track track)  {
        if (trackRepository.existsById(track.getTrackId())) {
            Track track1 = trackRepository.findById(track.getTrackId()).get();
            track1.setTrackcomments(track.getTrackcomments());
            trackRepository.save(track1);
            return track1;
        } else {
            try {
                throw new TrackNotFoundException("track not found");
            } catch (TrackNotFoundException e) {
                e.printStackTrace();
            }
        }
        return track;
    }


}
