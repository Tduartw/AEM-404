import styled from 'styled-components';

const gray01 = '#333333';
const gray02 = '#4F4F4F';

const spaceMonoFontFamily = "'Space Mono', monospace, sans-serif";

export const Container = styled.main`
    gap: 4rem;
    display: grid;
    grid-template-columns: 1fr minmax(290px, 1fr);
    margin: 6rem 0;

    @media (max-width: 768px) {
        grid-template-columns: 1fr;
    }
`
export const ImageContainer = styled.div`
    max-width: 33.7rem;
    max-height: 27.96rem;
    margin: 0 auto;
    img{
        width: 100%;
        height: auto; 
    }
`
export const FlexDiv = styled.div`
    flex: 1;
`

export const Anchor = styled.a`
    margin-top: 4rem;
    background-color: #333333;
    font-size: 0.875rem;
    font-weight: 700;
    color: #fff;
    border: none;
    padding: 1.5rem 2.6rem;
    cursor: pointer;
    display: block;
    width: fit-content;
    font-family: ${spaceMonoFontFamily};

`
export const Span = styled.span`
    font-size: 4rem;
    color: ${gray01};
    font-weight: 700;
    font-family: ${spaceMonoFontFamily};
`

export const Paragraph = styled.p`
    font-size: 1.5rem;
    color: ${gray02};
    max-width: 24rem;
    margin-top: 2.25rem;
    font-family: ${spaceMonoFontFamily};
`
