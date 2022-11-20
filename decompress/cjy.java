import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjy
{
    public static ohy a() {
        switch (Build$VERSION.SDK_INT) {
            case 27: {
                if (Build$VERSION.PREVIEW_SDK_INT == 0) {
                    return (ohy)new ii8();
                }
                break;
            }
            case 26: {
                return (ohy)new npe();
            }
            case 25: {
                return (ohy)new ewj();
            }
            case 24: {
                return (ohy)new chw();
            }
            case 23: {
                return (ohy)new rml((da8)null);
            }
            case 22: {
                return (ohy)new q3j();
            }
            case 21: {
                return (ohy)new omy();
            }
        }
        return (ohy)new ycs();
    }
}
