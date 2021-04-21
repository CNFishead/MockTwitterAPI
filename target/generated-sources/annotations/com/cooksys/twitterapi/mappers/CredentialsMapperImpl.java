package com.cooksys.twitterapi.mappers;

import com.cooksys.twitterapi.entities.Credentials;
import com.cooksys.twitterapi.models.CredentialsDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-18T21:51:48-0400",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 13.0.1 (Oracle Corporation)"
)
@Component
public class CredentialsMapperImpl implements CredentialsMapper {

    @Override
    public Credentials dtoToEntity(CredentialsDto credentialsDto) {
        if ( credentialsDto == null ) {
            return null;
        }

        Credentials credentials = new Credentials();

        credentials.setUsername( credentialsDto.getUsername() );
        credentials.setPassword( credentialsDto.getPassword() );

        return credentials;
    }
}
