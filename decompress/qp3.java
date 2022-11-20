import android.app.NotificationChannel;
import java.util.Iterator;
import android.os.Trace;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qp3
{
    public final bev a;
    
    public qp3(final bev a) {
        czd.f((Object)a, "notificationManager");
        this.a = a;
    }
    
    public final int a(final List<String> list, int n) {
        final boolean empty = list.isEmpty();
        final int n2 = 1;
        int n3 = 0;
        Label_0105: {
            if (!empty) {
                for (final String s : list) {
                    try {
                        Trace.beginSection("ChannelImportanceChecker#check");
                        final NotificationChannel g = this.a.g(s);
                        Trace.endSection();
                        if (g != null && g.getImportance() == 0) {
                            n3 = 1;
                        }
                        else {
                            n3 = 0;
                        }
                        if (n3 != 0) {
                            n3 = n2;
                            break Label_0105;
                        }
                        continue;
                    }
                    finally {
                        Trace.endSection();
                    }
                    break;
                }
            }
            n3 = 0;
        }
        if (n3 != 0) {
            n = 0;
        }
        return n;
    }
}
