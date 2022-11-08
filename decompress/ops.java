import java.util.Date;
import java.util.Calendar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ops extends wp1
{
    public static final String REPEAT_DAILY = "DAILY";
    public static final String REPEAT_HOURLY = "HOURLY";
    public static final String REPEAT_MONTHLY = "MONTHLY";
    public static final String REPEAT_NEVER = "NEVER";
    public static final String REPEAT_WEEKLY = "WEEKLY";
    public static final String REPEAT_YEARLY = "YEARLY";
    public String frequency;
    public String start;
    public long window;
    
    public final boolean b(final mjr mjr) {
        final Date u = k3j.u(this.start);
        if (u != null) {
            final Calendar instance = Calendar.getInstance();
            instance.setTime(u);
            final long e = mjr.e();
            while (instance.getTimeInMillis() <= e) {
                if (instance.getTimeInMillis() + this.window >= e) {
                    return true;
                }
                final String frequency = this.frequency;
                int n = -1;
                switch (frequency.hashCode()) {
                    case 2136870513: {
                        if (frequency.equals("HOURLY")) {
                            n = 0;
                            break;
                        }
                        break;
                    }
                    case 1954618349: {
                        if (frequency.equals("MONTHLY")) {
                            n = 3;
                            break;
                        }
                        break;
                    }
                    case 74175084: {
                        if (frequency.equals("NEVER")) {
                            n = 5;
                            break;
                        }
                        break;
                    }
                    case 64808441: {
                        if (frequency.equals("DAILY")) {
                            n = 1;
                            break;
                        }
                        break;
                    }
                    case -1681232246: {
                        if (frequency.equals("YEARLY")) {
                            n = 4;
                            break;
                        }
                        break;
                    }
                    case -1738378111: {
                        if (frequency.equals("WEEKLY")) {
                            n = 2;
                            break;
                        }
                        break;
                    }
                }
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                if (n != 4) {
                                    ck1.r(" \u2716\ufe0e Time signal not matching");
                                    return false;
                                }
                                instance.add(1, 1);
                            }
                            else {
                                instance.add(2, 1);
                            }
                        }
                        else {
                            instance.add(3, 1);
                        }
                    }
                    else {
                        instance.add(6, 1);
                    }
                }
                else {
                    instance.add(11, 1);
                }
            }
            ck1.r(" \u2716\ufe0e Time signal not matching");
            return false;
        }
        return true;
    }
    
    public final int d() {
        return 48;
    }
}
