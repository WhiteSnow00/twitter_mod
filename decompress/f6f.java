import java.util.List;
import java.util.ArrayList;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f6f implements uwo
{
    public static final int[] b;
    public static final int[] c;
    public final Resources a;
    
    static {
        b = new int[] { 2131952107, 2131952112, 2131952109 };
        c = new int[] { 2131952103, 2131952102, 2131952098, 2131952100, 2131952104 };
    }
    
    public f6f(final Resources a) {
        this.a = a;
    }
    
    public final uwo$a a(final f3j f3j) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        this.b(list, list2, 2131952110, true);
        this.b(list, list2, 2131952111, true);
        final int n = 0;
        this.b(list, list2, 2131952108, false);
        final int[] b = f6f.b;
        for (int i = 0; i < 3; ++i) {
            this.b(list, list2, b[i], f3j.i);
        }
        this.b(list, list2, 2131952105, f3j.j);
        this.b(list, list2, 2131952106, f3j.h);
        if (f3j.k) {
            this.b(list, list2, 2131952114, true);
        }
        else if (f3j.l) {
            this.b(list, list2, 2131952113, true);
            this.b(list, list2, 2131952116, false);
        }
        if (f3j.k || f3j.l) {
            final int[] c = f6f.c;
            for (int j = n; j < 5; ++j) {
                final String string = this.a.getString(c[j]);
                final StringBuilder sb = new StringBuilder();
                sb.append("\t\u25e6 ");
                sb.append(string);
                list.add(sb.toString());
            }
        }
        return new uwo$a((List)list);
    }
    
    public final void b(List<String> list, final List<String> list2, final int n, final boolean b) {
        final String string = this.a.getString(n);
        if (!b) {
            list = list2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("\u2022 ");
        sb.append(string);
        list.add(sb.toString());
    }
}
