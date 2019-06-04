package com.stackroute.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data




@Table(name="track")
public class Track {



    @Id
    @Column(name= "trackid")
    private int trackId;
    @Column(name= "trackname")
    private String trackName;
    @Column(name= "trackcomments")
    private String trackcomments;




    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackcomments() {
        return trackcomments;
    }

    public void setTrackcomments(String trackcomments) {
        this.trackcomments = trackcomments;
    }

    public Track() {
    }

    public Track(int trackId, String trackName, String trackcomments) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackcomments = trackcomments;
    }
}





