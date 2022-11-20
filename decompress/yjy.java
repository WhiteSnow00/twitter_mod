import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yjy
{
    public final Context a;
    
    public yjy(final Context a) {
        this.a = a;
    }
    
    public final Set<String> a() {
        monitorenter(yjy.class);
        try {
            Label_0056: {
                try {
                    Set stringSet;
                    if ((stringSet = this.b().getStringSet("modules_to_uninstall_if_emulated", (Set)new HashSet())) == null) {
                        stringSet = new HashSet();
                    }
                    break Label_0056;
                }
                finally {
                    monitorexit(yjy.class);
                    monitorexit(yjy.class);
                    return;
                }
            }
        }
        catch (final Exception ex) {}
    }
    
    public final SharedPreferences b() {
        return this.a.getSharedPreferences("playcore_split_install_internal", 0);
    }
}
