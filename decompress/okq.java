import java.util.List;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class okq
{
    public final Resources a;
    
    public okq(final Resources a) {
        this.a = a;
    }
    
    public final String a(final List<String> list, int size) {
        final String quantityString = this.a.getQuantityString(2131820628, size, new Object[] { size });
        e0e.e((Object)quantityString, "resources.getQuantityStr\u2026    othersCount\n        )");
        size = list.size();
        String s;
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        s = this.a.getString(2131955981, new Object[] { list.get(0), list.get(1), quantityString });
                    }
                    else {
                        s = this.a.getString(2131955981, new Object[] { list.get(0), list.get(1), list.get(2) });
                    }
                }
                else {
                    s = this.a.getString(2131955982, new Object[] { list.get(0), list.get(1) });
                }
            }
            else {
                s = this.a.getString(2131955979, new Object[] { list.get(0) });
            }
        }
        else {
            s = null;
        }
        return s;
    }
}
