import com.google.android.gms.common.api.a;
import android.content.Context;
import java.util.Objects;
import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f4y
{
    public final SparseIntArray a;
    public o5c b;
    
    public f4y(final o5c b) {
        this.a = new SparseIntArray();
        Objects.requireNonNull(b, "null reference");
        this.b = b;
    }
    
    public final int a(final Context context, final a.f f) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(f, "null reference");
        final boolean i = f.i();
        final int n = 0;
        if (!i) {
            return 0;
        }
        final int r = f.r();
        int n2 = this.a.get(r, -1);
        if (n2 == -1) {
            while (true) {
                for (int j = 0; j < this.a.size(); ++j) {
                    final int key = this.a.keyAt(j);
                    if (key > r && this.a.get(key) == 0) {
                        n2 = n;
                        if (n2 == -1) {
                            n2 = this.b.c(context, r);
                        }
                        this.a.put(r, n2);
                        return n2;
                    }
                }
                n2 = -1;
                continue;
            }
        }
        return n2;
    }
}
