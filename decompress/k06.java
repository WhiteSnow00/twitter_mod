import java.io.IOException;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.graphics.Shader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k06
{
    public final Shader a;
    public final ColorStateList b;
    public int c;
    
    public k06(final Shader a, final ColorStateList b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static k06 a(final Resources resources, int n, final Resources$Theme resources$Theme) throws IOException, XmlPullParserException {
        final XmlResourceParser xml = resources.getXml(n);
        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
        do {
            n = ((XmlPullParser)xml).next();
        } while (n != 2 && n != 1);
        if (n != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        final String name = ((XmlPullParser)xml).getName();
        Objects.requireNonNull(name);
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                final ColorStateList b = ar4.b(resources, (XmlPullParser)xml, attributeSet, resources$Theme);
                return new k06(null, b, b.getDefaultColor());
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(((XmlPullParser)xml).getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        else {
            final String name2 = ((XmlPullParser)xml).getName();
            if (name2.equals("gradient")) {
                final TypedArray o = cmv.o(resources, resources$Theme, attributeSet, sh4.H0);
                final float g = cmv.g(o, (XmlPullParser)xml, "startX", 8, 0.0f);
                final float g2 = cmv.g(o, (XmlPullParser)xml, "startY", 9, 0.0f);
                final float g3 = cmv.g(o, (XmlPullParser)xml, "endX", 10, 0.0f);
                final float g4 = cmv.g(o, (XmlPullParser)xml, "endY", 11, 0.0f);
                final float g5 = cmv.g(o, (XmlPullParser)xml, "centerX", 3, 0.0f);
                final float g6 = cmv.g(o, (XmlPullParser)xml, "centerY", 4, 0.0f);
                final int h = cmv.h(o, (XmlPullParser)xml, "type", 2, 0);
                n = cmv.d(o, (XmlPullParser)xml, "startColor", 0);
                final boolean n2 = cmv.n((XmlPullParser)xml, "centerColor");
                final int d = cmv.d(o, (XmlPullParser)xml, "centerColor", 7);
                final int d2 = cmv.d(o, (XmlPullParser)xml, "endColor", 1);
                final int h2 = cmv.h(o, (XmlPullParser)xml, "tileMode", 6, 0);
                final float g7 = cmv.g(o, (XmlPullParser)xml, "gradientRadius", 5, 0.0f);
                o.recycle();
                final int n3 = ((XmlPullParser)xml).getDepth() + 1;
                final ArrayList list = new ArrayList(20);
                final ArrayList list2 = new ArrayList(20);
                while (true) {
                    final int next = ((XmlPullParser)xml).next();
                    if (next == 1) {
                        break;
                    }
                    final int depth = ((XmlPullParser)xml).getDepth();
                    if (depth < n3 && next == 3) {
                        break;
                    }
                    if (next != 2) {
                        continue;
                    }
                    if (depth > n3) {
                        continue;
                    }
                    if (!((XmlPullParser)xml).getName().equals("item")) {
                        continue;
                    }
                    final TypedArray o2 = cmv.o(resources, resources$Theme, attributeSet, sh4.I0);
                    final boolean hasValue = o2.hasValue(0);
                    final boolean hasValue2 = o2.hasValue(1);
                    if (!hasValue || !hasValue2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(((XmlPullParser)xml).getPositionDescription());
                        sb2.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                        throw new XmlPullParserException(sb2.toString());
                    }
                    final int color = o2.getColor(0, 0);
                    final float float1 = o2.getFloat(1, 0.0f);
                    o2.recycle();
                    list2.add(color);
                    list.add(float1);
                }
                r5c r5c;
                if (list2.size() > 0) {
                    r5c = new r5c(list2, list);
                }
                else {
                    r5c = null;
                }
                if (r5c == null) {
                    if (n2) {
                        r5c = new r5c(n, d, d2);
                    }
                    else {
                        r5c = new r5c(n, d2);
                    }
                }
                Object o3;
                if (h != 1) {
                    if (h != 2) {
                        final int[] a = r5c.a;
                        final float[] b2 = r5c.b;
                        Shader$TileMode shader$TileMode;
                        if (h2 != 1) {
                            if (h2 != 2) {
                                shader$TileMode = Shader$TileMode.CLAMP;
                            }
                            else {
                                shader$TileMode = Shader$TileMode.MIRROR;
                            }
                        }
                        else {
                            shader$TileMode = Shader$TileMode.REPEAT;
                        }
                        o3 = new LinearGradient(g, g2, g3, g4, a, b2, shader$TileMode);
                    }
                    else {
                        o3 = new SweepGradient(g5, g6, r5c.a, r5c.b);
                    }
                }
                else {
                    if (g7 <= 0.0f) {
                        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                    }
                    final int[] a2 = r5c.a;
                    final float[] b3 = r5c.b;
                    Shader$TileMode shader$TileMode2;
                    if (h2 != 1) {
                        if (h2 != 2) {
                            shader$TileMode2 = Shader$TileMode.CLAMP;
                        }
                        else {
                            shader$TileMode2 = Shader$TileMode.MIRROR;
                        }
                    }
                    else {
                        shader$TileMode2 = Shader$TileMode.REPEAT;
                    }
                    o3 = new RadialGradient(g5, g6, g7, a2, b3, shader$TileMode2);
                }
                return new k06((Shader)o3, null, 0);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(((XmlPullParser)xml).getPositionDescription());
            sb3.append(": invalid gradient color tag ");
            sb3.append(name2);
            throw new XmlPullParserException(sb3.toString());
        }
    }
    
    public final boolean b() {
        return this.a != null;
    }
    
    public final boolean c() {
        if (this.a == null) {
            final ColorStateList b = this.b;
            if (b != null && b.isStateful()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean d(final int[] array) {
        if (this.c()) {
            final ColorStateList b = this.b;
            final int colorForState = b.getColorForState(array, b.getDefaultColor());
            if (colorForState != this.c) {
                final boolean b2 = true;
                this.c = colorForState;
                return b2;
            }
        }
        return false;
    }
    
    public final boolean e() {
        return this.b() || this.c != 0;
    }
}
