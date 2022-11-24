import android.text.Layout;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pjs
{
    public static final awj<Integer, Integer> a;
    
    static {
        final Integer value = 0;
        a = new awj((Object)value, (Object)value);
    }
    
    public static final TextDirectionHeuristic a(final int n) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                e0e.e((Object)textDirectionHeuristic, "FIRSTSTRONG_LTR");
                            }
                            else {
                                textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                                e0e.e((Object)textDirectionHeuristic, "LOCALE");
                            }
                        }
                        else {
                            textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                            e0e.e((Object)textDirectionHeuristic, "ANYRTL_LTR");
                        }
                    }
                    else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        e0e.e((Object)textDirectionHeuristic, "FIRSTSTRONG_RTL");
                    }
                }
                else {
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    e0e.e((Object)textDirectionHeuristic, "FIRSTSTRONG_LTR");
                }
            }
            else {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
                e0e.e((Object)textDirectionHeuristic, "RTL");
            }
        }
        else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
            e0e.e((Object)textDirectionHeuristic, "LTR");
        }
        return textDirectionHeuristic;
    }
    
    public static final boolean b(final Layout layout, final int n) {
        e0e.f((Object)layout, "<this>");
        return layout.getEllipsisCount(n) > 0;
    }
}
