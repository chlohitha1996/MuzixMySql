package com.stackroute.Repository;

import com.stackroute.Domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {

    @Query("select t from Track t where t.trackName=:trackName")
    public List<Track> getTrackByName(@Param("trackName")String trackName);


}