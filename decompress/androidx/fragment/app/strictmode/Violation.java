// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003" }, d2 = { "Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release" }, k = 1, mv = { 1, 6, 0 })
public abstract class Violation extends RuntimeException
{
    public final Fragment C0;
    
    public Violation(final Fragment c0, final String s) {
        zzd.f((Object)c0, "fragment");
        super(s);
        this.C0 = c0;
    }
}
