package com.foobartory.domain;

import java.util.UUID;

public class NumSerie {

        private NumSerie() {
                throw new IllegalStateException("Utility class");
        }


        public static int generateUniqueId() {
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replace("-", "");
        return Integer.parseInt(str);
    }
}
