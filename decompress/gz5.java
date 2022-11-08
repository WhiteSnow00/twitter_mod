import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gz5
{
    public static Drawable a(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws IOException, XmlPullParserException {
        return Drawable.createFromXmlInner(resources, xmlPullParser, set, resources$Theme);
    }
    
    public static int b(final TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }
    
    public static void c(final Drawable drawable, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws IOException, XmlPullParserException {
        drawable.inflate(resources, xmlPullParser, set, resources$Theme);
    }
}
