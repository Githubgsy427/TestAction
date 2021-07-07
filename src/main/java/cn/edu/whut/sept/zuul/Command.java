package TestAction.src.main.java.cn.edu.whut.sept.zuul;

/**
 *
 */
public abstract class Command
{
    private String secondWord;
    private String neirong;
    private String gsy;
    private String hgn;
    private String zb;


    public Command()
    {
        secondWord = null;
    }

    public String getSecondWord()
    {
        return secondWord;
    }

    public boolean hasSecondWord()
    {
        return secondWord != null;
    }

    public void setSecondWord(String secondWord)
    {
        this.secondWord = secondWord;
    }

    public abstract boolean execute(Game game);
}
