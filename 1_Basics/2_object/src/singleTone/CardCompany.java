package singleTone;

public class CardCompany {
    private static CardCompany company;
    private Card card;

    private CardCompany(){}

    public static CardCompany getInstance()
    {
        if (company == null)
            company = new CardCompany();
        return company;
    }

    public Card createCard()
    {
        card = new Card();
        return card;
    }
}
