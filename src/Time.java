import java.time.LocalTime;
public class Time {
    private short hour;
    private short minute;
    private short second;

    public Time(short hour, short minute, short second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(String time)
    {
        String[] splitTimeStr = time.split(":", 3);
        this.hour   =   Short.valueOf(splitTimeStr[0]);
        this.minute =   Short.valueOf(splitTimeStr[1]);
        this.second =   Short.valueOf(splitTimeStr[2]);
    }

    public Time(short second) {
        this.hour   = (short) (second / 3600);
        this.minute = (short) (second / 60 % 60);
        this.second = (short) (second % 60);
    }

    public Time(LocalTime localTime) {
        this.hour   = (short) localTime.getHour();
        this.minute = (short) localTime.getMinute();
        this.second = (short) localTime.getSecond();
    }

    public short toSecond()
    {
        return (short) (this.hour * 3600 + this.minute * 60 + this.second);
    }

    public short toMinute()
    {
        return (short) (this.hour * 60 + this.minute + second / 60);
    }

    public Time subtraction(Time time)
    {
        return new Time( (short) (this.toSecond() - time.toSecond()));
    }

    public Time subtractionSecond(short second)
    {
        return new Time ((short) (this.toSecond() - second));
    }

    public Time additionSecond(short second)
    {
        return new Time((short) (this.toSecond() + second));
    }

    public Time addition(Time time)
    {
        return new Time((short) (this.toSecond() + time.toSecond()));
    }

    public boolean isEqual(Time time)
    {
        return this.toSecond() == time.toSecond();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}