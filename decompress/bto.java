import android.os.Bundle;
import com.twitter.weaver.mvi.MviViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bto
{
    public static final <VM extends MviViewModel<VS, ?, ?>, VS extends oax> gub<sso, gub<? super VS, ? super Bundle, oyv>, vpx> a(final VM vm) {
        zzd.f((Object)vm, "<this>");
        return (gub<sso, gub<? super VS, ? super Bundle, oyv>, vpx>)new bto$a((MviViewModel)vm);
    }
    
    public static final String b(final String s) {
        String y;
        final String s2 = y = "with_serializable:data";
        if (s != null) {
            y = zi.y("with_serializable:data", ":", s);
            if (y == null) {
                y = s2;
            }
        }
        return y;
    }
}
