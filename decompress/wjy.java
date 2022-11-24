import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wjy
{
    public static iiy a() {
        switch (Build$VERSION.SDK_INT) {
            case 27: {
                if (Build$VERSION.PREVIEW_SDK_INT == 0) {
                    return (iiy)new kny(6);
                }
                break;
            }
            case 26: {
                return (iiy)new dnl();
            }
            case 25: {
                return (iiy)new cmi();
            }
            case 24: {
                return (iiy)new d4j();
            }
            case 23: {
                return (iiy)new tpz();
            }
            case 22: {
                return (iiy)new llg();
            }
            case 21: {
                return (iiy)new kny(5);
            }
        }
        return (iiy)new uvx();
    }
}
