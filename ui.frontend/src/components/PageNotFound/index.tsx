import React from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';
import {Container, ImageContainer, Anchor, FlexDiv, Paragraph, Span} from './style';

const pageNotFound = (props: any) => {
    return(
        <Container>
            <ImageContainer>
                <img src={props.fileReference} alt={props.alt}/>
            </ImageContainer>
            <FlexDiv>
                <Span>{props.firstMessage}</Span>
                <Paragraph>{props.secondMessage}</Paragraph>
                <Anchor href={props.buttonLink}>{props.buttonText}</Anchor>
            </FlexDiv>
        </Container>
    )
};

export default MapTo('reactapp/components/pageNotFound')(pageNotFound)



