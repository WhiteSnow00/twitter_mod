// 
// Decompiled by Procyon v0.6.0
// 

public final class hnp
{
    public long checkInterval;
    public a limits;
    public b nightTime;
    
    public hnp() {
        this.limits = new a();
        this.nightTime = new b();
        this.checkInterval = 15L;
    }
    
    public static final class a
    {
        public long daily;
        public long hourly;
        public long monthly;
        public long triggerInterval;
        public long weekly;
        public long yearly;
        
        public a() {
            this.hourly = 0L;
            this.daily = 0L;
            this.weekly = 0L;
            this.monthly = 0L;
            this.yearly = 0L;
            this.triggerInterval = 0L;
        }
    }
    
    public static final class b
    {
        public boolean enabled;
        public String end;
        public String start;
        
        public b() {
            this.enabled = false;
            this.start = "23:00";
            this.end = "06:00";
        }
    }
}
