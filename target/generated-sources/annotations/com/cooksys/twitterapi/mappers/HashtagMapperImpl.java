package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.entities.Hashtag;
import com.cooksys.twitterapi.models.HashtagDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-18T21:51:48-0400",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 13.0.1 (Oracle Corporation)"
)
@Component
public class HashtagMapperImpl implements HashtagMapper {

    @Override
    public HashtagDto entityToDto(Hashtag hashtag) {
        if ( hashtag == null ) {
            return null;
        }

        HashtagDto hashtagDto = new HashtagDto();

        hashtagDto.setLabel( hashtag.getLabel() );
        hashtagDto.setFirstUsed( hashtag.getFirstUsed() );
        hashtagDto.setLastUsed( hashtag.getLastUsed() );

        return hashtagDto;
    }

    @Override
    public List<HashtagDto> entitiesToDtos(List<Hashtag> hashtags) {
        if ( hashtags == null ) {
            return null;
        }

        List<HashtagDto> list = new ArrayList<HashtagDto>( hashtags.size() );
        for ( Hashtag hashtag : hashtags ) {
            list.add( entityToDto( hashtag ) );
        }

        return list;
    }
}
