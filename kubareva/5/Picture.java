public class Picture extends ItemForSale{
    private String style;
    private Artist artist;

    public Picture (String pictureName, int picturePaintingYear, String pictureStyle,
                    Artist pictureArtist, int price) throws WrongPriceException {
        super(pictureName, picturePaintingYear, price);
        this.style = pictureStyle;
        this.artist = pictureArtist;
        this.artist.addPicture(this);
    }

    public String getPictureStyle() {
        return style;
    }

    public Artist getPictureAuthor() {
        return artist;
    }

    @Override
    public String getDescription() {
        return "Was painted in " + getYear() + " by " + artist.getName() + " " + artist.getSurname() +
                " in style: " + style;
    }
}
