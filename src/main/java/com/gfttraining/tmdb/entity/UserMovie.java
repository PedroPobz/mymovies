package com.gfttraining.tmdb.entity;

import lombok.Data;




public class UserMovie {
    
        private int userid;
        private boolean favourite;
        private int personal_rating;
        private String notes;
        
        public int getUserid() {
            return userid;
        }
        public void setUserid(int userid) {
            this.userid = userid;
        }
        public boolean isFavourite() {
            return favourite;
        }
        public void setFavourite(boolean favourite) {
            this.favourite = favourite;
        }
        public int getPersonal_rating() {
            return personal_rating;
        }
        public void setPersonal_rating(int personal_rating) {
            this.personal_rating = personal_rating;
        }
        public String getNotes() {
            return notes;
        }
        public void setNotes(String notes) {
            this.notes = notes;
        }
            
}

