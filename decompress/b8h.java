// 
// Decompiled by Procyon v0.6.0
// 

public final class b8h
{
    public long currentDayCount;
    public long currentHourCount;
    public long currentMonthCount;
    public long currentWeekCount;
    public long currentYearCount;
    public long dayStartTime;
    public long hourStartTime;
    public long lastMessageChecked;
    public long lastMessageDisplayed;
    public long monthStartTime;
    public long weekStartTime;
    public long yearStartTime;
    
    public b8h() {
        this.yearStartTime = 0L;
        this.currentYearCount = 0L;
        this.monthStartTime = 0L;
        this.currentMonthCount = 0L;
        this.weekStartTime = 0L;
        this.currentWeekCount = 0L;
        this.dayStartTime = 0L;
        this.currentDayCount = 0L;
        this.hourStartTime = 0L;
        this.currentHourCount = 0L;
        this.lastMessageDisplayed = 0L;
        this.lastMessageChecked = 0L;
    }
}
