import java.io.FilterOutputStream;
import java.io.EOFException;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.util.Iterator;
import java.util.Objects;
import java.util.Map;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.io.BufferedInputStream;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Arrays;
import java.nio.ByteOrder;
import java.util.Set;
import android.content.res.AssetManager$AssetInputStream;
import java.util.List;
import java.util.regex.Pattern;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public class rga
{
    public static final byte[] A;
    public static final d B;
    public static final d[][] C;
    public static final d[] D;
    public static final d E;
    public static final d F;
    public static final HashMap<Integer, d>[] G;
    public static final HashMap<String, d>[] H;
    public static final HashSet<String> I;
    public static final HashMap<Integer, Integer> J;
    public static final Charset K;
    public static final byte[] L;
    public static final Pattern M;
    public static final List<Integer> r;
    public static final List<Integer> s;
    public static final int[] t;
    public static final int[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final String[] y;
    public static final int[] z;
    public final String a;
    public final AssetManager$AssetInputStream b;
    public int c;
    public final HashMap<String, c>[] d;
    public Set<Integer> e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public byte[] j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    
    static {
        final Integer value = 1;
        final Integer value2 = 3;
        final Integer value3 = 2;
        final Integer value4 = 8;
        r = Arrays.asList(value, 6, value2, value4);
        final Integer value5 = 7;
        final Integer value6 = 5;
        s = Arrays.asList(value3, value5, 4, value6);
        t = new int[] { 8, 8, 8 };
        u = new int[] { 8 };
        v = new byte[] { -1, -40, -1 };
        w = new byte[] { 79, 76, 89, 77, 80, 0 };
        x = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
        y = new String[] { "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE" };
        z = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1 };
        A = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
        final d[] array = { new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256), new d("ImageLength", 257), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278), new d("StripByteCounts", 279), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7) };
        final d d = new d("ExposureTime", 33434, 5);
        final d d2 = new d("FNumber", 33437, 5);
        final d d3 = new d("ExposureProgram", 34850, 3);
        final d d4 = new d("SpectralSensitivity", 34852, 2);
        final d d5 = new d("PhotographicSensitivity", 34855, 3);
        final d d6 = new d("OECF", 34856, 7);
        final d d7 = new d("ExifVersion", 36864, 2);
        final d d8 = new d("DateTimeOriginal", 36867, 2);
        final d d9 = new d("DateTimeDigitized", 36868, 2);
        final d d10 = new d("ComponentsConfiguration", 37121, 7);
        final d d11 = new d("CompressedBitsPerPixel", 37122, 5);
        final d d12 = new d("ShutterSpeedValue", 37377, 10);
        final d d13 = new d("ApertureValue", 37378, 5);
        final d d14 = new d("BrightnessValue", 37379, 10);
        final d d15 = new d("ExposureBiasValue", 37380, 10);
        final d d16 = new d("MaxApertureValue", 37381, 5);
        final d d17 = new d("SubjectDistance", 37382, 5);
        final d d18 = new d("MeteringMode", 37383, 3);
        final d d19 = new d("LightSource", 37384, 3);
        final d d20 = new d("Flash", 37385, 3);
        final d d21 = new d("FocalLength", 37386, 5);
        final d d22 = new d("SubjectArea", 37396, 3);
        final d d23 = new d("MakerNote", 37500, 7);
        final d d24 = new d("UserComment", 37510, 7);
        final d d25 = new d("SubSecTime", 37520, 2);
        final d d26 = new d("SubSecTimeOriginal", 37521, 2);
        final d d27 = new d("SubSecTimeDigitized", 37522, 2);
        final d d28 = new d("FlashpixVersion", 40960, 7);
        final d d29 = new d("ColorSpace", 40961, 3);
        final d d30 = new d("PixelXDimension", 40962);
        final d d31 = new d("PixelYDimension", 40963);
        final d d32 = new d("RelatedSoundFile", 40964, 2);
        final d d33 = new d("InteroperabilityIFDPointer", 40965, 4);
        final d d34 = new d("FlashEnergy", 41483, 5);
        final d d35 = new d("SpatialFrequencyResponse", 41484, 7);
        final d d36 = new d("FocalPlaneXResolution", 41486, 5);
        final d d37 = new d("FocalPlaneYResolution", 41487, 5);
        final d d38 = new d("FocalPlaneResolutionUnit", 41488, 3);
        final d d39 = new d("SubjectLocation", 41492, 3);
        final d d40 = new d("ExposureIndex", 41493, 5);
        final d d41 = new d("SensingMethod", 41495, 3);
        final d d42 = new d("FileSource", 41728, 7);
        final d d43 = new d("SceneType", 41729, 7);
        final d d44 = new d("CFAPattern", 41730, 7);
        final d d45 = new d("CustomRendered", 41985, 3);
        final d d46 = new d("ExposureMode", 41986, 3);
        final d d47 = new d("WhiteBalance", 41987, 3);
        final d d48 = new d("DigitalZoomRatio", 41988, 5);
        final d d49 = new d("FocalLengthIn35mmFilm", 41989, 3);
        final d d50 = new d("SceneCaptureType", 41990, 3);
        final d d51 = new d("GainControl", 41991, 3);
        final d d52 = new d("Contrast", 41992, 3);
        final d d53 = new d("Saturation", 41993, 3);
        final d d54 = new d("Sharpness", 41994, 3);
        final d d55 = new d("DeviceSettingDescription", 41995, 7);
        final d d56 = new d("SubjectDistanceRange", 41996, 3);
        final d d57 = new d("ImageUniqueID", 42016, 2);
        final d d58 = new d("DNGVersion", 50706, 1);
        final d d59 = new d("DefaultCropSize", 50720);
        final d d60 = new d("GPSVersionID", 0, 1);
        final d d61 = new d("GPSLatitudeRef", 1, 2);
        final d d62 = new d("GPSLatitude", 2, 5);
        final d d63 = new d("GPSLongitudeRef", 3, 2);
        final d d64 = new d("GPSLongitude", 4, 5);
        final d d65 = new d("GPSAltitudeRef", 5, 1);
        final d d66 = new d("GPSAltitude", 6, 5);
        final d d67 = new d("GPSTimeStamp", 7, 5);
        final d d68 = new d("GPSSatellites", 8, 2);
        final d d69 = new d("GPSStatus", 9, 2);
        final d d70 = new d("GPSMeasureMode", 10, 2);
        final d d71 = new d("GPSDOP", 11, 5);
        final d d72 = new d("GPSSpeedRef", 12, 2);
        final d d73 = new d("GPSSpeed", 13, 5);
        final d d74 = new d("GPSTrackRef", 14, 2);
        final d d75 = new d("GPSTrack", 15, 5);
        final d d76 = new d("GPSImgDirectionRef", 16, 2);
        final d d77 = new d("GPSImgDirection", 17, 5);
        final d d78 = new d("GPSMapDatum", 18, 2);
        final d d79 = new d("GPSDestLatitudeRef", 19, 2);
        final d d80 = new d("GPSDestLatitude", 20, 5);
        final d d81 = new d("GPSDestLongitudeRef", 21, 2);
        final d d82 = new d("GPSDestLongitude", 22, 5);
        final d d83 = new d("GPSDestBearingRef", 23, 2);
        final d d84 = new d("GPSDestBearing", 24, 5);
        final d d85 = new d("GPSDestDistanceRef", 25, 2);
        final d d86 = new d("GPSDestDistance", 26, 5);
        final d d87 = new d("GPSProcessingMethod", 27, 7);
        final d d88 = new d("GPSAreaInformation", 28, 7);
        final d d89 = new d("GPSDateStamp", 29, 2);
        final d d90 = new d("GPSDifferential", 30, 3);
        final d d91 = new d("InteroperabilityIndex", 1, 2);
        final d d92 = new d("NewSubfileType", 254, 4);
        final d d93 = new d("SubfileType", 255, 4);
        final d d94 = new d("ThumbnailImageWidth", 256);
        final d d95 = new d("ThumbnailImageLength", 257);
        final d d96 = new d("BitsPerSample", 258, 3);
        final d d97 = new d("Compression", 259, 3);
        final d d98 = new d("PhotometricInterpretation", 262, 3);
        final d d99 = new d("ImageDescription", 270, 2);
        final d d100 = new d("Make", 271, 2);
        final d d101 = new d("Model", 272, 2);
        final d d102 = new d("StripOffsets", 273);
        final d d103 = new d("Orientation", 274, 3);
        final d d104 = new d("SamplesPerPixel", 277, 3);
        final d d105 = new d("RowsPerStrip", 278);
        final d d106 = new d("StripByteCounts", 279);
        final d d107 = new d("XResolution", 282, 5);
        final d d108 = new d("YResolution", 283, 5);
        final d d109 = new d("PlanarConfiguration", 284, 3);
        final d d110 = new d("ResolutionUnit", 296, 3);
        final d d111 = new d("TransferFunction", 301, 3);
        final d d112 = new d("Software", 305, 2);
        final d d113 = new d("DateTime", 306, 2);
        final d d114 = new d("Artist", 315, 2);
        final d d115 = new d("WhitePoint", 318, 5);
        final d d116 = new d("PrimaryChromaticities", 319, 5);
        final d d117 = new d("SubIFDPointer", 330, 4);
        final d d118 = new d("JPEGInterchangeFormat", 513, 4);
        final d d119 = new d("JPEGInterchangeFormatLength", 514, 4);
        final d d120 = new d("YCbCrCoefficients", 529, 5);
        final d d121 = new d("YCbCrSubSampling", 530, 3);
        final d d122 = new d("YCbCrPositioning", 531, 3);
        final d d123 = new d("ReferenceBlackWhite", 532, 5);
        final d d124 = new d("Copyright", 33432, 2);
        final d d125 = new d("ExifIFDPointer", 34665, 4);
        final d d126 = new d("GPSInfoIFDPointer", 34853, 4);
        final d d127 = new d("DNGVersion", 50706, 1);
        final d d128 = new d("DefaultCropSize", 50720);
        B = new d("StripOffsets", 273, 3);
        C = new d[][] { array, { d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40, d41, d42, d43, d44, d45, d46, d47, d48, d49, d50, d51, d52, d53, d54, d55, d56, d57, d58, d59 }, { d60, d61, d62, d63, d64, d65, d66, d67, d68, d69, d70, d71, d72, d73, d74, d75, d76, d77, d78, d79, d80, d81, d82, d83, d84, d85, d86, d87, d88, d89, d90 }, { d91 }, { d92, d93, d94, d95, d96, d97, d98, d99, d100, d101, d102, d103, d104, d105, d106, d107, d108, d109, d110, d111, d112, d113, d114, d115, d116, d117, d118, d119, d120, d121, d122, d123, d124, d125, d126, d127, d128 }, array, { new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4) }, { new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4) }, { new d("AspectFrame", 4371, 3) }, { new d("ColorSpace", 55, 3) } };
        D = new d[] { new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1) };
        E = new d("JPEGInterchangeFormat", 513, 4);
        F = new d("JPEGInterchangeFormatLength", 514, 4);
        G = new HashMap[10];
        H = new HashMap[10];
        I = new HashSet<String>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        J = new HashMap<Integer, Integer>();
        L = "Exif\u0000\u0000".getBytes(K = Charset.forName("US-ASCII"));
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int n = 0;
        while (true) {
            final d[][] c = rga.C;
            if (n >= c.length) {
                break;
            }
            rga.G[n] = new HashMap<Integer, d>();
            rga.H[n] = new HashMap<String, d>();
            for (final d d129 : c[n]) {
                rga.G[n].put(d129.a, d129);
                rga.H[n].put(d129.b, d129);
            }
            ++n;
        }
        final HashMap<Integer, Integer> j = rga.J;
        final d[] d130 = rga.D;
        j.put(d130[0].a, value6);
        j.put(d130[1].a, value);
        j.put(d130[2].a, value3);
        j.put(d130[3].a, value2);
        j.put(d130[4].a, value5);
        j.put(d130[5].a, value4);
        Pattern.compile(".*[1-9].*");
        M = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }
    
    public rga(final InputStream inputStream) throws IOException {
        final d[][] c = rga.C;
        this.d = new HashMap[c.length];
        this.e = new HashSet(c.length);
        this.f = ByteOrder.BIG_ENDIAN;
        this.a = null;
        if (inputStream instanceof AssetManager$AssetInputStream) {
            this.b = (AssetManager$AssetInputStream)inputStream;
        }
        else {
            this.b = null;
        }
        this.s(inputStream);
    }
    
    public rga(final String a) throws IOException {
        final d[][] c = rga.C;
        this.d = new HashMap[c.length];
        this.e = new HashSet(c.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (a == null) {
            throw new IllegalArgumentException("filename cannot be null");
        }
        Closeable closeable = null;
        this.b = null;
        this.a = a;
        try {
            final FileInputStream fileInputStream = new FileInputStream(a);
            try {
                this.s(fileInputStream);
                b(fileInputStream);
                return;
            }
            finally {
                closeable = fileInputStream;
            }
        }
        finally {}
        b(closeable);
    }
    
    public static void b(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0016;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {
            goto Label_0016;
        }
    }
    
    public static double c(final String s, final String s2) {
        try {
            final String[] split = s.split(",", -1);
            final String[] split2 = split[0].split("/", -1);
            final double n = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            final String[] split3 = split[1].split("/", -1);
            final double n2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            final String[] split4 = split[2].split("/", -1);
            final double n3 = Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim()) / 3600.0 + (n2 / 60.0 + n);
            if (s2.equals("S") || s2.equals("W")) {
                return -n3;
            }
            if (!s2.equals("N") && !s2.equals("E")) {
                throw new IllegalArgumentException();
            }
            return n3;
        }
        catch (final NumberFormatException | ArrayIndexOutOfBoundsException ex) {
            throw new IllegalArgumentException();
        }
    }
    
    public static long[] d(final Object o) {
        if (o instanceof int[]) {
            final int[] array = (int[])o;
            final long[] array2 = new long[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        if (o instanceof long[]) {
            return (long[])o;
        }
        return null;
    }
    
    public static Pair<Integer, Integer> p(final String s) {
        final boolean contains = s.contains(",");
        final Integer value = 2;
        final Integer value2 = -1;
        int i = 1;
        if (contains) {
            final String[] split = s.split(",", -1);
            Pair p;
            final Pair<Integer, Integer> pair = (Pair<Integer, Integer>)(p = p(split[0]));
            if ((int)pair.first == 2) {
                return pair;
            }
            while (i < split.length) {
                final Pair<Integer, Integer> p2 = p(split[i]);
                int intValue;
                if (!((Integer)p2.first).equals(p.first) && !((Integer)p2.second).equals(p.first)) {
                    intValue = -1;
                }
                else {
                    intValue = (int)p.first;
                }
                int intValue2;
                if ((int)p.second != -1 && (((Integer)p2.first).equals(p.second) || ((Integer)p2.second).equals(p.second))) {
                    intValue2 = (int)p.second;
                }
                else {
                    intValue2 = -1;
                }
                if (intValue == -1 && intValue2 == -1) {
                    return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                }
                if (intValue == -1) {
                    p = new Pair((Object)intValue2, (Object)value2);
                }
                else if (intValue2 == -1) {
                    p = new Pair((Object)intValue, (Object)value2);
                }
                ++i;
            }
            return (Pair<Integer, Integer>)p;
        }
        else {
            Label_0417: {
                if (!s.contains("/")) {
                    break Label_0417;
                }
                final String[] split2 = s.split("/", -1);
                Label_0405: {
                    if (split2.length != 2) {
                        break Label_0405;
                    }
                    try {
                        final long n = (long)Double.parseDouble(split2[0]);
                        final long n2 = (long)Double.parseDouble(split2[1]);
                        if (n < 0L || n2 < 0L) {
                            return (Pair<Integer, Integer>)new Pair((Object)10, (Object)value2);
                        }
                        if (n <= 2147483647L && n2 <= 2147483647L) {
                            return (Pair<Integer, Integer>)new Pair((Object)10, (Object)5);
                        }
                        return (Pair<Integer, Integer>)new Pair((Object)5, (Object)value2);
                        try {
                            final Long value3 = Long.parseLong(s);
                            if (value3 >= 0L && value3 <= 65535L) {
                                return (Pair<Integer, Integer>)new Pair((Object)3, (Object)4);
                            }
                            if (value3 < 0L) {
                                return (Pair<Integer, Integer>)new Pair((Object)9, (Object)value2);
                            }
                            return (Pair<Integer, Integer>)new Pair((Object)4, (Object)value2);
                        }
                        catch (final NumberFormatException ex) {
                            try {
                                Double.parseDouble(s);
                                return (Pair<Integer, Integer>)new Pair((Object)12, (Object)value2);
                            }
                            catch (final NumberFormatException ex2) {
                                return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                            }
                        }
                        return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                    }
                    catch (final NumberFormatException ex3) {
                        return (Pair<Integer, Integer>)new Pair((Object)value, (Object)value2);
                    }
                }
            }
        }
    }
    
    public final void A(final a a, final int n) throws IOException {
        final c c = this.d[n].get("DefaultCropSize");
        final c c2 = this.d[n].get("SensorTopBorder");
        final c c3 = this.d[n].get("SensorLeftBorder");
        final c c4 = this.d[n].get("SensorBottomBorder");
        final c c5 = this.d[n].get("SensorRightBorder");
        if (c != null) {
            c c6;
            c c7;
            if (c.a == 5) {
                final e[] array = (e[])c.j(this.f);
                if (array == null || array.length != 2) {
                    final StringBuilder f = ehk.f("Invalid crop size values. cropSize=");
                    f.append(Arrays.toString(array));
                    Log.w("ExifInterface", f.toString());
                    return;
                }
                c6 = rga.c.d(new e[] { array[0] }, this.f);
                c7 = rga.c.d(new e[] { array[1] }, this.f);
            }
            else {
                final int[] array2 = (int[])c.j(this.f);
                if (array2 == null || array2.length != 2) {
                    final StringBuilder f2 = ehk.f("Invalid crop size values. cropSize=");
                    f2.append(Arrays.toString(array2));
                    Log.w("ExifInterface", f2.toString());
                    return;
                }
                c6 = rga.c.e(array2[0], this.f);
                c7 = rga.c.e(array2[1], this.f);
            }
            this.d[n].put("ImageWidth", c6);
            this.d[n].put("ImageLength", c7);
        }
        else if (c2 != null && c3 != null && c4 != null && c5 != null) {
            final int h = c2.h(this.f);
            final int h2 = c4.h(this.f);
            final int h3 = c5.h(this.f);
            final int h4 = c3.h(this.f);
            if (h2 > h && h3 > h4) {
                final c e = rga.c.e(h2 - h, this.f);
                final c e2 = rga.c.e(h3 - h4, this.f);
                this.d[n].put("ImageLength", e);
                this.d[n].put("ImageWidth", e2);
            }
        }
        else {
            final c c8 = this.d[n].get("ImageLength");
            final c c9 = this.d[n].get("ImageWidth");
            if (c8 == null || c9 == null) {
                final c c10 = this.d[n].get("JPEGInterchangeFormat");
                if (c10 != null) {
                    this.h(a, c10.h(this.f), n);
                }
            }
        }
    }
    
    public final void a() {
        final String e = this.e("DateTimeOriginal");
        if (e != null && this.e("DateTime") == null) {
            this.d[0].put("DateTime", rga.c.a(e));
        }
        if (this.e("ImageWidth") == null) {
            this.d[0].put("ImageWidth", rga.c.b(0L, this.f));
        }
        if (this.e("ImageLength") == null) {
            this.d[0].put("ImageLength", rga.c.b(0L, this.f));
        }
        if (this.e("Orientation") == null) {
            this.d[0].put("Orientation", rga.c.b(0L, this.f));
        }
        if (this.e("LightSource") == null) {
            this.d[1].put("LightSource", rga.c.b(0L, this.f));
        }
    }
    
    public String e(String string) {
        final c g = this.g(string);
        Label_0229: {
            if (g == null) {
                break Label_0229;
            }
            if (!rga.I.contains(string)) {
                return g.i(this.f);
            }
            if (string.equals("GPSTimeStamp")) {
                final int a = g.a;
                if (a != 5 && a != 10) {
                    final StringBuilder f = ehk.f("GPS Timestamp format is not rational. format=");
                    f.append(g.a);
                    Log.w("ExifInterface", f.toString());
                    return null;
                }
                final e[] array = (e[])g.j(this.f);
                if (array != null && array.length == 3) {
                    return String.format("%02d:%02d:%02d", (int)(array[0].a / (float)array[0].b), (int)(array[1].a / (float)array[1].b), (int)(array[2].a / (float)array[2].b));
                }
                final StringBuilder f2 = ehk.f("Invalid GPS Timestamp array. array=");
                f2.append(Arrays.toString(array));
                Log.w("ExifInterface", f2.toString());
                return null;
            }
            try {
                string = Double.toString(g.g(this.f));
                return string;
                return null;
            }
            catch (final NumberFormatException ex) {
                return null;
            }
        }
    }
    
    public final int f(int h) {
        final c g = this.g("Orientation");
        if (g == null) {
            return h;
        }
        try {
            h = g.h(this.f);
            return h;
        }
        catch (final NumberFormatException ex) {
            return h;
        }
    }
    
    public final c g(final String s) {
        String s2 = s;
        if ("ISOSpeedRatings".equals(s)) {
            s2 = "PhotographicSensitivity";
        }
        for (int i = 0; i < rga.C.length; ++i) {
            final c c = this.d[i].get(s2);
            if (c != null) {
                return c;
            }
        }
        return null;
    }
    
    public final void h(final a a, int n, final int n2) throws IOException {
        a.G0 = ByteOrder.BIG_ENDIAN;
        a.b(n);
        final byte byte1 = a.readByte();
        if (byte1 != -1) {
            final StringBuilder f = ehk.f("Invalid marker: ");
            f.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(f.toString());
        }
        if (a.readByte() != -40) {
            final StringBuilder f2 = ehk.f("Invalid marker: ");
            f2.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(f2.toString());
        }
        n = n + 1 + 1;
        while (true) {
            final byte byte2 = a.readByte();
            if (byte2 != -1) {
                final StringBuilder f3 = ehk.f("Invalid marker:");
                f3.append(Integer.toHexString(byte2 & 0xFF));
                throw new IOException(f3.toString());
            }
            final byte byte3 = a.readByte();
            if (byte3 == -39 || byte3 == -38) {
                a.G0 = this.f;
                return;
            }
            final int n3 = a.readUnsignedShort() - 2;
            int l = n + 1 + 1 + 2;
            if (n3 < 0) {
                throw new IOException("Invalid length");
            }
            int n4 = 0;
            Label_0514: {
                if (byte3 != -31) {
                    if (byte3 != -2) {
                        switch (byte3) {
                            default:
                                Label_0238: {
                                    switch (byte3) {
                                        default: {
                                            switch (byte3) {
                                                default: {
                                                    switch (byte3) {
                                                        default: {
                                                            n = n3;
                                                            n4 = l;
                                                            break Label_0514;
                                                        }
                                                        case -51:
                                                        case -50:
                                                        case -49: {
                                                            break Label_0238;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case -55:
                                                case -54:
                                                case -53: {
                                                    break Label_0238;
                                                }
                                            }
                                            break;
                                        }
                                        case -59:
                                        case -58:
                                        case -57: {
                                            break Label_0238;
                                        }
                                    }
                                    break;
                                }
                            case -64:
                            case -63:
                            case -62:
                            case -61: {
                                if (a.skipBytes(1) == 1) {
                                    this.d[n2].put("ImageLength", rga.c.b(a.readUnsignedShort(), this.f));
                                    this.d[n2].put("ImageWidth", rga.c.b(a.readUnsignedShort(), this.f));
                                    n = n3 - 5;
                                    n4 = l;
                                    break Label_0514;
                                }
                                throw new IOException("Invalid SOFx");
                            }
                        }
                    }
                    else {
                        final byte[] array = new byte[n3];
                        if (a.read(array) != n3) {
                            throw new IOException("Invalid exif");
                        }
                        n4 = l;
                        if (this.e("UserComment") == null) {
                            this.d[1].put("UserComment", rga.c.a(new String(array, rga.K)));
                            n4 = l;
                        }
                    }
                }
                else {
                    if (n3 < 6) {
                        n = n3;
                        n4 = l;
                        break Label_0514;
                    }
                    final byte[] array2 = new byte[6];
                    if (a.read(array2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    l += 6;
                    n = n3 - 6;
                    if (!Arrays.equals(array2, rga.L)) {
                        n4 = l;
                        break Label_0514;
                    }
                    if (n <= 0) {
                        throw new IOException("Invalid exif");
                    }
                    this.l = l;
                    final byte[] array3 = new byte[n];
                    if (a.read(array3) != n) {
                        throw new IOException("Invalid exif");
                    }
                    n4 = l + n;
                    final a a2 = new a(array3);
                    this.t(a2, n);
                    this.v(a2, n2);
                }
                n = 0;
            }
            if (n < 0) {
                throw new IOException("Invalid length");
            }
            if (a.skipBytes(n) != n) {
                throw new IOException("Invalid JPEG segment");
            }
            n += n4;
        }
    }
    
    @Deprecated
    public final boolean i(final float[] array) {
        final String e = this.e("GPSLatitude");
        final String e2 = this.e("GPSLatitudeRef");
        final String e3 = this.e("GPSLongitude");
        final String e4 = this.e("GPSLongitudeRef");
        double[] array2 = null;
        Label_0153: {
            if (e != null && e2 != null && e3 != null && e4 != null) {
                try {
                    array2 = new double[] { c(e, e2), c(e3, e4) };
                    break Label_0153;
                }
                catch (final IllegalArgumentException ex) {
                    final StringBuilder f = ehk.f("Latitude/longitude values are not parseable. ");
                    f.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", e, e2, e3, e4));
                    Log.w("ExifInterface", f.toString());
                }
            }
            array2 = null;
        }
        if (array2 == null) {
            return false;
        }
        array[0] = (float)array2[0];
        array[1] = (float)array2[1];
        return true;
    }
    
    public final int j(final BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        final byte[] array = new byte[5000];
        bufferedInputStream.read(array);
        bufferedInputStream.reset();
        int n = 0;
        int n2 = 0;
        int n3;
        boolean b;
        while (true) {
            final byte[] v = rga.v;
            final int length = v.length;
            n3 = 1;
            if (n2 >= length) {
                b = true;
                break;
            }
            if (array[n2] != v[n2]) {
                b = false;
                break;
            }
            ++n2;
        }
        if (b) {
            return 4;
        }
        final byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i = 0;
        while (true) {
            while (i < bytes.length) {
                if (array[i] != bytes[i]) {
                    final boolean b2 = false;
                    if (b2) {
                        return 9;
                    }
                    final a a = new a(array);
                    final ByteOrder u = this.u(a);
                    this.f = u;
                    a.G0 = u;
                    final short short1 = a.readShort();
                    a.close();
                    if (short1 == 20306 || short1 == 21330) {
                        return 7;
                    }
                    final a a2 = new a(array);
                    final ByteOrder u2 = this.u(a2);
                    this.f = u2;
                    a2.G0 = u2;
                    final short short2 = a2.readShort();
                    a2.close();
                    int n4;
                    if (short2 == 85) {
                        n4 = n3;
                    }
                    else {
                        n4 = 0;
                    }
                    if (n4 != 0) {
                        n = 10;
                    }
                    return n;
                }
                else {
                    ++i;
                }
            }
            final boolean b2 = true;
            continue;
        }
    }
    
    public final void k(final a a) throws IOException {
        this.m(a);
        final c c = this.d[1].get("MakerNote");
        if (c != null) {
            final a a2 = new a(c.c);
            a2.G0 = this.f;
            final byte[] w = rga.w;
            final byte[] array = new byte[w.length];
            a2.readFully(array);
            a2.b(0L);
            final byte[] x = rga.x;
            final byte[] array2 = new byte[x.length];
            a2.readFully(array2);
            if (Arrays.equals(array, w)) {
                a2.b(8L);
            }
            else if (Arrays.equals(array2, x)) {
                a2.b(12L);
            }
            this.v(a2, 6);
            final c c2 = this.d[7].get("PreviewImageStart");
            final c c3 = this.d[7].get("PreviewImageLength");
            if (c2 != null && c3 != null) {
                this.d[5].put("JPEGInterchangeFormat", c2);
                this.d[5].put("JPEGInterchangeFormatLength", c3);
            }
            final c c4 = this.d[8].get("AspectFrame");
            if (c4 != null) {
                final int[] array3 = (int[])c4.j(this.f);
                if (array3 != null && array3.length == 4) {
                    if (array3[2] > array3[0] && array3[3] > array3[1]) {
                        final int n = array3[2] - array3[0] + 1;
                        final int n2 = array3[3] - array3[1] + 1;
                        int n3;
                        int n4;
                        if ((n3 = n) < (n4 = n2)) {
                            final int n5 = n + n2;
                            n4 = n5 - n2;
                            n3 = n5 - n4;
                        }
                        final c e = rga.c.e(n3, this.f);
                        final c e2 = rga.c.e(n4, this.f);
                        this.d[0].put("ImageWidth", e);
                        this.d[0].put("ImageLength", e2);
                    }
                }
                else {
                    final StringBuilder f = ehk.f("Invalid aspect frame values. frame=");
                    f.append(Arrays.toString(array3));
                    Log.w("ExifInterface", f.toString());
                }
            }
        }
    }
    
    public final void l(final a a) throws IOException {
        a.skipBytes(84);
        final byte[] array = new byte[4];
        final byte[] array2 = new byte[4];
        a.read(array);
        a.skipBytes(4);
        a.read(array2);
        final int int1 = ByteBuffer.wrap(array).getInt();
        final int int2 = ByteBuffer.wrap(array2).getInt();
        this.h(a, int1, 5);
        a.b(int2);
        a.G0 = ByteOrder.BIG_ENDIAN;
        for (int int3 = a.readInt(), i = 0; i < int3; ++i) {
            final int unsignedShort = a.readUnsignedShort();
            final int unsignedShort2 = a.readUnsignedShort();
            if (unsignedShort == rga.B.a) {
                final short short1 = a.readShort();
                final short short2 = a.readShort();
                final c e = rga.c.e(short1, this.f);
                final c e2 = rga.c.e(short2, this.f);
                this.d[0].put("ImageLength", e);
                this.d[0].put("ImageWidth", e2);
                return;
            }
            a.skipBytes(unsignedShort2);
        }
    }
    
    public final void m(a a) throws IOException {
        this.t(a, a.available());
        this.v(a, 0);
        this.A(a, 0);
        this.A(a, 5);
        this.A(a, 4);
        this.z(0, 5);
        this.z(0, 4);
        this.z(5, 4);
        final c c = this.d[1].get("PixelXDimension");
        final c c2 = this.d[1].get("PixelYDimension");
        if (c != null && c2 != null) {
            this.d[0].put("ImageWidth", c);
            this.d[0].put("ImageLength", c2);
        }
        if (this.d[4].isEmpty() && this.r(this.d[5])) {
            final HashMap<String, c>[] d = this.d;
            d[4] = d[5];
            d[5] = new HashMap<String, c>();
        }
        if (!this.r(this.d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.c == 8) {
            final c c3 = this.d[1].get("MakerNote");
            if (c3 != null) {
                a = new a(c3.c);
                a.G0 = this.f;
                a.b(6L);
                this.v(a, 9);
                final c c4 = this.d[9].get("ColorSpace");
                if (c4 != null) {
                    this.d[1].put("ColorSpace", c4);
                }
            }
        }
    }
    
    public final void n(final a a) throws IOException {
        this.m(a);
        if (this.d[0].get("JpgFromRaw") != null) {
            this.h(a, this.p, 5);
        }
        final c c = this.d[0].get("ISO");
        final c c2 = this.d[1].get("PhotographicSensitivity");
        if (c != null && c2 == null) {
            this.d[1].put("PhotographicSensitivity", c);
        }
    }
    
    public final byte[] o() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        rga.g:Z
        //     4: istore_2       
        //     5: aconst_null    
        //     6: astore          6
        //     8: iload_2        
        //     9: ifne            14
        //    12: aconst_null    
        //    13: areturn        
        //    14: aload_0        
        //    15: getfield        rga.j:[B
        //    18: astore          5
        //    20: aload           5
        //    22: ifnull          28
        //    25: aload           5
        //    27: areturn        
        //    28: aload_0        
        //    29: getfield        rga.b:Landroid/content/res/AssetManager$AssetInputStream;
        //    32: astore          5
        //    34: aload           5
        //    36: ifnull          101
        //    39: aload           5
        //    41: astore          7
        //    43: aload           5
        //    45: astore          6
        //    47: aload           5
        //    49: invokevirtual   java/io/InputStream.markSupported:()Z
        //    52: ifeq            71
        //    55: aload           5
        //    57: astore          7
        //    59: aload           5
        //    61: astore          6
        //    63: aload           5
        //    65: invokevirtual   java/io/InputStream.reset:()V
        //    68: goto            127
        //    71: aload           5
        //    73: astore          7
        //    75: aload           5
        //    77: astore          6
        //    79: ldc_w           "ExifInterface"
        //    82: ldc_w           "Cannot read thumbnail from inputstream without mark/reset support"
        //    85: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    88: pop            
        //    89: aload           5
        //    91: invokestatic    rga.b:(Ljava/io/Closeable;)V
        //    94: aconst_null    
        //    95: areturn        
        //    96: astore          5
        //    98: goto            358
        //   101: aload_0        
        //   102: getfield        rga.a:Ljava/lang/String;
        //   105: ifnull          124
        //   108: new             Ljava/io/FileInputStream;
        //   111: dup            
        //   112: aload_0        
        //   113: getfield        rga.a:Ljava/lang/String;
        //   116: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //   119: astore          5
        //   121: goto            127
        //   124: aconst_null    
        //   125: astore          5
        //   127: aload           5
        //   129: ifnull          311
        //   132: aload           5
        //   134: astore          7
        //   136: aload           5
        //   138: astore          6
        //   140: aload           5
        //   142: aload_0        
        //   143: getfield        rga.h:I
        //   146: i2l            
        //   147: invokevirtual   java/io/InputStream.skip:(J)J
        //   150: lstore_3       
        //   151: aload           5
        //   153: astore          7
        //   155: aload           5
        //   157: astore          6
        //   159: aload_0        
        //   160: getfield        rga.h:I
        //   163: istore_1       
        //   164: lload_3        
        //   165: iload_1        
        //   166: i2l            
        //   167: lcmp           
        //   168: ifne            271
        //   171: aload           5
        //   173: astore          7
        //   175: aload           5
        //   177: astore          6
        //   179: aload_0        
        //   180: getfield        rga.i:I
        //   183: newarray        B
        //   185: astore          8
        //   187: aload           5
        //   189: astore          7
        //   191: aload           5
        //   193: astore          6
        //   195: aload           5
        //   197: aload           8
        //   199: invokevirtual   java/io/InputStream.read:([B)I
        //   202: aload_0        
        //   203: getfield        rga.i:I
        //   206: if_icmpne       231
        //   209: aload           5
        //   211: astore          7
        //   213: aload           5
        //   215: astore          6
        //   217: aload_0        
        //   218: aload           8
        //   220: putfield        rga.j:[B
        //   223: aload           5
        //   225: invokestatic    rga.b:(Ljava/io/Closeable;)V
        //   228: aload           8
        //   230: areturn        
        //   231: aload           5
        //   233: astore          7
        //   235: aload           5
        //   237: astore          6
        //   239: new             Ljava/io/IOException;
        //   242: astore          8
        //   244: aload           5
        //   246: astore          7
        //   248: aload           5
        //   250: astore          6
        //   252: aload           8
        //   254: ldc_w           "Corrupted image"
        //   257: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   260: aload           5
        //   262: astore          7
        //   264: aload           5
        //   266: astore          6
        //   268: aload           8
        //   270: athrow         
        //   271: aload           5
        //   273: astore          7
        //   275: aload           5
        //   277: astore          6
        //   279: new             Ljava/io/IOException;
        //   282: astore          8
        //   284: aload           5
        //   286: astore          7
        //   288: aload           5
        //   290: astore          6
        //   292: aload           8
        //   294: ldc_w           "Corrupted image"
        //   297: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   300: aload           5
        //   302: astore          7
        //   304: aload           5
        //   306: astore          6
        //   308: aload           8
        //   310: athrow         
        //   311: aload           5
        //   313: astore          7
        //   315: aload           5
        //   317: astore          6
        //   319: new             Ljava/io/FileNotFoundException;
        //   322: astore          8
        //   324: aload           5
        //   326: astore          7
        //   328: aload           5
        //   330: astore          6
        //   332: aload           8
        //   334: invokespecial   java/io/FileNotFoundException.<init>:()V
        //   337: aload           5
        //   339: astore          7
        //   341: aload           5
        //   343: astore          6
        //   345: aload           8
        //   347: athrow         
        //   348: astore          5
        //   350: goto            383
        //   353: astore          5
        //   355: aconst_null    
        //   356: astore          7
        //   358: aload           7
        //   360: astore          6
        //   362: ldc_w           "ExifInterface"
        //   365: ldc_w           "Encountered exception while getting thumbnail"
        //   368: aload           5
        //   370: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   373: pop            
        //   374: aload           7
        //   376: invokestatic    rga.b:(Ljava/io/Closeable;)V
        //   379: aconst_null    
        //   380: areturn        
        //   381: astore          5
        //   383: aload           6
        //   385: invokestatic    rga.b:(Ljava/io/Closeable;)V
        //   388: aload           5
        //   390: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  28     34     353    358    Ljava/io/IOException;
        //  28     34     348    353    Any
        //  47     55     96     101    Ljava/io/IOException;
        //  47     55     381    383    Any
        //  63     68     96     101    Ljava/io/IOException;
        //  63     68     381    383    Any
        //  79     89     96     101    Ljava/io/IOException;
        //  79     89     381    383    Any
        //  101    121    353    358    Ljava/io/IOException;
        //  101    121    348    353    Any
        //  140    151    96     101    Ljava/io/IOException;
        //  140    151    381    383    Any
        //  159    164    96     101    Ljava/io/IOException;
        //  159    164    381    383    Any
        //  179    187    96     101    Ljava/io/IOException;
        //  179    187    381    383    Any
        //  195    209    96     101    Ljava/io/IOException;
        //  195    209    381    383    Any
        //  217    223    96     101    Ljava/io/IOException;
        //  217    223    381    383    Any
        //  239    244    96     101    Ljava/io/IOException;
        //  239    244    381    383    Any
        //  252    260    96     101    Ljava/io/IOException;
        //  252    260    381    383    Any
        //  268    271    96     101    Ljava/io/IOException;
        //  268    271    381    383    Any
        //  279    284    96     101    Ljava/io/IOException;
        //  279    284    381    383    Any
        //  292    300    96     101    Ljava/io/IOException;
        //  292    300    381    383    Any
        //  308    311    96     101    Ljava/io/IOException;
        //  308    311    381    383    Any
        //  319    324    96     101    Ljava/io/IOException;
        //  319    324    381    383    Any
        //  332    337    96     101    Ljava/io/IOException;
        //  332    337    381    383    Any
        //  345    348    96     101    Ljava/io/IOException;
        //  345    348    381    383    Any
        //  362    374    381    383    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void q(final a a, final HashMap hashMap) throws IOException {
        final c c = hashMap.get("JPEGInterchangeFormat");
        final c c2 = hashMap.get("JPEGInterchangeFormatLength");
        if (c != null && c2 != null) {
            final int h = c.h(this.f);
            final int min = Math.min(c2.h(this.f), a.available() - h);
            final int c3 = this.c;
            int h2 = 0;
            Label_0118: {
                int n;
                if (c3 != 4 && c3 != 9 && c3 != 10) {
                    h2 = h;
                    if (c3 != 7) {
                        break Label_0118;
                    }
                    n = this.m;
                }
                else {
                    n = this.l;
                }
                h2 = h + n;
            }
            if (h2 > 0 && min > 0) {
                this.g = true;
                this.h = h2;
                this.i = min;
                if (this.a == null && this.b == null) {
                    final byte[] j = new byte[min];
                    a.b(h2);
                    a.readFully(j);
                    this.j = j;
                }
            }
        }
    }
    
    public final boolean r(final HashMap hashMap) throws IOException {
        final c c = hashMap.get("ImageLength");
        final c c2 = hashMap.get("ImageWidth");
        if (c != null && c2 != null) {
            final int h = c.h(this.f);
            final int h2 = c2.h(this.f);
            if (h <= 512 && h2 <= 512) {
                return true;
            }
        }
        return false;
    }
    
    public final void s(final InputStream inputStream) throws IOException {
        int i = 0;
        try {
            try {
                while (i < rga.C.length) {
                    this.d[i] = new HashMap<String, c>();
                    ++i;
                }
                final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.c = this.j(bufferedInputStream);
                final a a = new a(bufferedInputStream);
                switch (this.c) {
                    case 10: {
                        this.n(a);
                        break;
                    }
                    case 9: {
                        this.l(a);
                        break;
                    }
                    case 7: {
                        this.k(a);
                        break;
                    }
                    case 4: {
                        this.h(a, 0, 0);
                        break;
                    }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 11: {
                        this.m(a);
                        break;
                    }
                }
                this.y(a);
                this.q = true;
            }
            finally {}
        }
        catch (final IOException ex) {
            this.q = false;
        }
        this.a();
        return;
        this.a();
    }
    
    public final void t(final a a, int n) throws IOException {
        final ByteOrder u = this.u(a);
        this.f = u;
        a.G0 = u;
        final int unsignedShort = a.readUnsignedShort();
        final int c = this.c;
        if (c != 7 && c != 10 && unsignedShort != 42) {
            final StringBuilder f = ehk.f("Invalid start code: ");
            f.append(Integer.toHexString(unsignedShort));
            throw new IOException(f.toString());
        }
        final int int1 = a.readInt();
        if (int1 < 8 || int1 >= n) {
            throw new IOException(rk0.B("Invalid first Ifd offset: ", int1));
        }
        n = int1 - 8;
        if (n > 0 && a.skipBytes(n) != n) {
            throw new IOException(rk0.B("Couldn't jump to first Ifd: ", n));
        }
    }
    
    public final ByteOrder u(final a a) throws IOException {
        final short short1 = a.readShort();
        if (short1 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (short1 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        final StringBuilder f = ehk.f("Invalid byte order: ");
        f.append(Integer.toHexString(short1));
        throw new IOException(f.toString());
    }
    
    public final void v(final a a, int int1) throws IOException {
        this.e.add(a.I0);
        if (a.I0 + 2 > a.H0) {
            return;
        }
        final short short1 = a.readShort();
        if (short1 * 12 + a.I0 <= a.H0) {
            if (short1 > 0) {
                for (short n = 0; n < short1; ++n) {
                    final int unsignedShort = a.readUnsignedShort();
                    final int unsignedShort2 = a.readUnsignedShort();
                    final int int2 = a.readInt();
                    final long n2 = a.I0 + 4L;
                    final d d = rga.G[int1].get(unsignedShort);
                    int n3 = 0;
                    long n4 = 0L;
                    boolean b2 = false;
                    Label_0503: {
                        Label_0500: {
                            Label_0359: {
                                if (d == null) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Skip the tag entry since tag number is not defined: ");
                                    sb.append(unsignedShort);
                                    Log.w("ExifInterface", sb.toString());
                                }
                                else {
                                    if (unsignedShort2 > 0) {
                                        final int[] z = rga.z;
                                        if (unsignedShort2 < z.length) {
                                            final int c = d.c;
                                            boolean b = false;
                                            Label_0303: {
                                                if (c != 7) {
                                                    if (unsignedShort2 != 7) {
                                                        if (c != unsignedShort2) {
                                                            final int d2 = d.d;
                                                            if (d2 != unsignedShort2) {
                                                                if ((c != 4 && d2 != 4) || unsignedShort2 != 3) {
                                                                    if ((c != 9 && d2 != 9) || unsignedShort2 != 8) {
                                                                        if ((c != 12 && d2 != 12) || unsignedShort2 != 11) {
                                                                            b = false;
                                                                            break Label_0303;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                b = true;
                                            }
                                            if (!b) {
                                                final StringBuilder f = ehk.f("Skip the tag entry since data format (");
                                                f.append(rga.y[unsignedShort2]);
                                                f.append(") is unexpected for tag: ");
                                                f.append(d.b);
                                                Log.w("ExifInterface", f.toString());
                                                break Label_0359;
                                            }
                                            if ((n3 = unsignedShort2) == 7) {
                                                n3 = c;
                                            }
                                            n4 = z[n3] * (long)int2;
                                            if (n4 >= 0L && n4 <= 2147483647L) {
                                                b2 = true;
                                                break Label_0503;
                                            }
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Skip the tag entry since the number of components is invalid: ");
                                            sb2.append(int2);
                                            Log.w("ExifInterface", sb2.toString());
                                            break Label_0500;
                                        }
                                    }
                                    final StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Skip the tag entry since data format is invalid: ");
                                    sb3.append(unsignedShort2);
                                    Log.w("ExifInterface", sb3.toString());
                                }
                            }
                            n4 = 0L;
                            n3 = unsignedShort2;
                        }
                        b2 = false;
                    }
                    if (!b2) {
                        a.b(n2);
                    }
                    else {
                        if (n4 > 4L) {
                            final int int3 = a.readInt();
                            final int c2 = this.c;
                            if (c2 == 7) {
                                if ("MakerNote".equals(d.b)) {
                                    this.m = int3;
                                }
                                else if (int1 == 6 && "ThumbnailImage".equals(d.b)) {
                                    this.n = int3;
                                    this.o = int2;
                                    final c e = rga.c.e(6, this.f);
                                    final c b3 = rga.c.b(this.n, this.f);
                                    final c b4 = rga.c.b(this.o, this.f);
                                    this.d[4].put("Compression", e);
                                    this.d[4].put("JPEGInterchangeFormat", b3);
                                    this.d[4].put("JPEGInterchangeFormatLength", b4);
                                }
                            }
                            else if (c2 == 10 && "JpgFromRaw".equals(d.b)) {
                                this.p = int3;
                            }
                            final long n5 = int3;
                            if (n5 + n4 > a.H0) {
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("Skip the tag entry since data offset is invalid: ");
                                sb4.append(int3);
                                Log.w("ExifInterface", sb4.toString());
                                a.b(n2);
                                continue;
                            }
                            a.b(n5);
                        }
                        final Integer n6 = rga.J.get(unsignedShort);
                        if (n6 != null) {
                            long a2 = -1L;
                            Label_0879: {
                                int n7;
                                if (n3 != 3) {
                                    if (n3 == 4) {
                                        a2 = a.a();
                                        break Label_0879;
                                    }
                                    if (n3 != 8) {
                                        if (n3 != 9 && n3 != 13) {
                                            break Label_0879;
                                        }
                                        n7 = a.readInt();
                                    }
                                    else {
                                        n7 = a.readShort();
                                    }
                                }
                                else {
                                    n7 = a.readUnsignedShort();
                                }
                                a2 = n7;
                            }
                            if (a2 > 0L && a2 < a.H0) {
                                if (!this.e.contains((int)a2)) {
                                    a.b(a2);
                                    this.v(a, n6);
                                }
                                else {
                                    final StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Skip jump into the IFD since it has already been read: IfdType ");
                                    sb5.append(n6);
                                    sb5.append(" (at ");
                                    sb5.append(a2);
                                    sb5.append(")");
                                    Log.w("ExifInterface", sb5.toString());
                                }
                            }
                            else {
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("Skip jump into the IFD since its offset is invalid: ");
                                sb6.append(a2);
                                Log.w("ExifInterface", sb6.toString());
                            }
                            a.b(n2);
                        }
                        else {
                            final byte[] array = new byte[(int)n4];
                            a.readFully(array);
                            final c c3 = new c(n3, int2, array);
                            this.d[int1].put(d.b, c3);
                            if ("DNGVersion".equals(d.b)) {
                                this.c = 3;
                            }
                            if ((("Make".equals(d.b) || "Model".equals(d.b)) && c3.i(this.f).contains("PENTAX")) || ("Compression".equals(d.b) && c3.h(this.f) == 65535)) {
                                this.c = 8;
                            }
                            if (a.I0 != n2) {
                                a.b(n2);
                            }
                        }
                    }
                }
                if (a.I0 + 4 <= a.H0) {
                    int1 = a.readInt();
                    final long n8 = int1;
                    if (n8 > 0L && int1 < a.H0) {
                        if (!this.e.contains(int1)) {
                            a.b(n8);
                            if (this.d[4].isEmpty()) {
                                this.v(a, 4);
                            }
                            else if (this.d[5].isEmpty()) {
                                this.v(a, 5);
                            }
                        }
                        else {
                            final StringBuilder sb7 = new StringBuilder();
                            sb7.append("Stop reading file since re-reading an IFD may cause an infinite loop: ");
                            sb7.append(int1);
                            Log.w("ExifInterface", sb7.toString());
                        }
                    }
                    else {
                        final StringBuilder sb8 = new StringBuilder();
                        sb8.append("Stop reading file since a wrong offset may cause an infinite loop: ");
                        sb8.append(int1);
                        Log.w("ExifInterface", sb8.toString());
                    }
                }
            }
        }
    }
    
    public final void w(final String s) {
        for (int i = 0; i < rga.C.length; ++i) {
            this.d[i].remove(s);
        }
    }
    
    public final void x(final InputStream inputStream, final OutputStream outputStream) throws IOException {
        final DataInputStream dataInputStream = new DataInputStream(inputStream);
        final ByteOrder big_ENDIAN = ByteOrder.BIG_ENDIAN;
        final b b = new b(outputStream);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        b.a(-1);
        if (dataInputStream.readByte() == -40) {
            b.a(-40);
            b.a(-1);
            b.a(-31);
            final d[][] c = rga.C;
            final int[] array = new int[c.length];
            final int[] array2 = new int[c.length];
            final d[] d = rga.D;
            for (int length = d.length, i = 0; i < length; ++i) {
                this.w(d[i].b);
            }
            this.w(rga.E.b);
            this.w(rga.F.b);
            for (int j = 0; j < rga.C.length; ++j) {
                final Object[] array3 = this.d[j].entrySet().toArray();
                for (int length2 = array3.length, k = 0; k < length2; ++k) {
                    final Map.Entry entry = (Map.Entry)array3[k];
                    if (entry.getValue() == null) {
                        this.d[j].remove(entry.getKey());
                    }
                }
            }
            if (!this.d[1].isEmpty()) {
                this.d[0].put(rga.D[1].b, rga.c.b(0L, this.f));
            }
            if (!this.d[2].isEmpty()) {
                this.d[0].put(rga.D[2].b, rga.c.b(0L, this.f));
            }
            if (!this.d[3].isEmpty()) {
                this.d[1].put(rga.D[3].b, rga.c.b(0L, this.f));
            }
            if (this.g) {
                this.d[4].put(rga.E.b, rga.c.b(0L, this.f));
                this.d[4].put(rga.F.b, rga.c.b(this.i, this.f));
            }
            for (int l = 0; l < rga.C.length; ++l) {
                final Iterator<Map.Entry<String, c>> iterator = this.d[l].entrySet().iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final c c2 = ((Map.Entry<K, c>)iterator.next()).getValue();
                    Objects.requireNonNull(c2);
                    final int n2 = rga.z[c2.a] * c2.b;
                    int n3 = n;
                    if (n2 > 4) {
                        n3 = n + n2;
                    }
                    n = n3;
                }
                array2[l] += n;
            }
            int n4 = 0;
            int n5 = 8;
            while (n4 < rga.C.length) {
                int n6 = n5;
                if (!this.d[n4].isEmpty()) {
                    array[n4] = n5;
                    n6 = n5 + (this.d[n4].size() * 12 + 2 + 4 + array2[n4]);
                }
                ++n4;
                n5 = n6;
            }
            int n7 = n5;
            if (this.g) {
                this.d[4].put(rga.E.b, rga.c.b(n5, this.f));
                this.h = n5 + 6;
                n7 = n5 + this.i;
            }
            if (!this.d[1].isEmpty()) {
                this.d[0].put(rga.D[1].b, rga.c.b(array[1], this.f));
            }
            if (!this.d[2].isEmpty()) {
                this.d[0].put(rga.D[2].b, rga.c.b(array[2], this.f));
            }
            if (!this.d[3].isEmpty()) {
                this.d[1].put(rga.D[3].b, rga.c.b(array[3], this.f));
            }
            b.c((short)(n7 + 8));
            b.write(rga.L);
            short n8;
            if (this.f == ByteOrder.BIG_ENDIAN) {
                n8 = 19789;
            }
            else {
                n8 = 18761;
            }
            b.c(n8);
            b.G0 = this.f;
            b.c((short)42);
            b.b((int)8L);
            for (int n9 = 0; n9 < rga.C.length; ++n9) {
                if (!this.d[n9].isEmpty()) {
                    b.c((short)this.d[n9].size());
                    int n10 = this.d[n9].size() * 12 + (array[n9] + 2) + 4;
                    for (final Map.Entry<Object, V> entry2 : this.d[n9].entrySet()) {
                        final int a = rga.H[n9].get(entry2.getKey()).a;
                        final c c3 = (c)entry2.getValue();
                        Objects.requireNonNull(c3);
                        int n11 = rga.z[c3.a] * c3.b;
                        b.c((short)a);
                        b.c((short)c3.a);
                        b.b(c3.b);
                        if (n11 > 4) {
                            b.b(n10);
                            n10 += n11;
                        }
                        else {
                            b.write(c3.c);
                            if (n11 >= 4) {
                                continue;
                            }
                            while (n11 < 4) {
                                b.a(0);
                                ++n11;
                            }
                        }
                    }
                    if (n9 == 0 && !this.d[4].isEmpty()) {
                        b.b(array[4]);
                    }
                    else {
                        b.b((int)0L);
                    }
                    final Iterator<Map.Entry<String, c>> iterator3 = this.d[n9].entrySet().iterator();
                    while (iterator3.hasNext()) {
                        final byte[] c4 = ((Map.Entry<K, c>)iterator3.next()).getValue().c;
                        if (c4.length > 4) {
                            b.write(c4, 0, c4.length);
                        }
                    }
                }
            }
            if (this.g) {
                b.write(this.o());
            }
            b.G0 = ByteOrder.BIG_ENDIAN;
            final byte[] array4 = new byte[4096];
            while (dataInputStream.readByte() == -1) {
                final byte byte1 = dataInputStream.readByte();
                if (byte1 == -39 || byte1 == -38) {
                    b.a(-1);
                    b.a(byte1);
                    final byte[] array5 = new byte[8192];
                    while (true) {
                        final int read = dataInputStream.read(array5);
                        if (read == -1) {
                            break;
                        }
                        b.write(array5, 0, read);
                    }
                    return;
                }
                if (byte1 != -31) {
                    b.a(-1);
                    b.a(byte1);
                    int unsignedShort = dataInputStream.readUnsignedShort();
                    b.c((short)unsignedShort);
                    unsignedShort -= 2;
                    if (unsignedShort < 0) {
                        throw new IOException("Invalid length");
                    }
                    while (unsignedShort > 0) {
                        final int read2 = dataInputStream.read(array4, 0, Math.min(unsignedShort, 4096));
                        if (read2 < 0) {
                            break;
                        }
                        b.write(array4, 0, read2);
                        unsignedShort -= read2;
                    }
                }
                else {
                    final int n12 = dataInputStream.readUnsignedShort() - 2;
                    if (n12 < 0) {
                        throw new IOException("Invalid length");
                    }
                    final byte[] array6 = new byte[6];
                    if (n12 >= 6) {
                        if (dataInputStream.read(array6) != 6) {
                            throw new IOException("Invalid exif");
                        }
                        if (Arrays.equals(array6, rga.L)) {
                            final int n13 = n12 - 6;
                            if (dataInputStream.skipBytes(n13) == n13) {
                                continue;
                            }
                            throw new IOException("Invalid length");
                        }
                    }
                    b.a(-1);
                    b.a(byte1);
                    b.c((short)(n12 + 2));
                    int n14;
                    if ((n14 = n12) >= 6) {
                        n14 = n12 - 6;
                        b.write(array6);
                    }
                    while (n14 > 0) {
                        final int read3 = dataInputStream.read(array4, 0, Math.min(n14, 4096));
                        if (read3 < 0) {
                            break;
                        }
                        b.write(array4, 0, read3);
                        n14 -= read3;
                    }
                }
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }
    
    public final void y(final a a) throws IOException {
        final HashMap<String, c> hashMap = this.d[4];
        final c c = hashMap.get("Compression");
        if (c != null) {
            final int h = c.h(this.f);
            if ((this.k = h) != 1) {
                if (h == 6) {
                    this.q(a, hashMap);
                    return;
                }
                if (h != 7) {
                    return;
                }
            }
            final c c2 = hashMap.get("BitsPerSample");
            boolean b = false;
            Label_0193: {
                Label_0191: {
                    if (c2 != null) {
                        final int[] array = (int[])c2.j(this.f);
                        final int[] t = rga.t;
                        if (!Arrays.equals(t, array)) {
                            if (this.c != 3) {
                                break Label_0191;
                            }
                            final c c3 = hashMap.get("PhotometricInterpretation");
                            if (c3 == null) {
                                break Label_0191;
                            }
                            final int h2 = c3.h(this.f);
                            if ((h2 != 1 || !Arrays.equals(array, rga.u)) && (h2 != 6 || !Arrays.equals(array, t))) {
                                break Label_0191;
                            }
                        }
                        b = true;
                        break Label_0193;
                    }
                }
                b = false;
            }
            if (b) {
                final c c4 = hashMap.get("StripOffsets");
                final c c5 = hashMap.get("StripByteCounts");
                if (c4 != null && c5 != null) {
                    final long[] d = d(c4.j(this.f));
                    final long[] d2 = d(c5.j(this.f));
                    if (d == null) {
                        Log.w("ExifInterface", "stripOffsets should not be null.");
                    }
                    else if (d2 == null) {
                        Log.w("ExifInterface", "stripByteCounts should not be null.");
                    }
                    else {
                        long n = 0L;
                        for (int length = d2.length, i = 0; i < length; ++i) {
                            n += d2[i];
                        }
                        final int j = (int)n;
                        final byte[] k = new byte[j];
                        int l = 0;
                        int n2 = 0;
                        int n3 = 0;
                        while (l < d.length) {
                            final int n4 = (int)d[l];
                            final int n5 = (int)d2[l];
                            final int n6 = n4 - n2;
                            if (n6 < 0) {
                                Log.d("ExifInterface", "Invalid strip offset value");
                            }
                            a.b(n6);
                            final byte[] array2 = new byte[n5];
                            a.read(array2);
                            n2 = n2 + n6 + n5;
                            System.arraycopy(array2, 0, k, n3, n5);
                            n3 += n5;
                            ++l;
                        }
                        this.g = true;
                        this.j = k;
                        this.i = j;
                    }
                }
            }
        }
        else {
            this.k = 6;
            this.q(a, hashMap);
        }
    }
    
    public final void z(final int n, final int n2) throws IOException {
        if (!this.d[n].isEmpty()) {
            if (!this.d[n2].isEmpty()) {
                final c c = this.d[n].get("ImageLength");
                final c c2 = this.d[n].get("ImageWidth");
                final c c3 = this.d[n2].get("ImageLength");
                final c c4 = this.d[n2].get("ImageWidth");
                if (c != null) {
                    if (c2 != null) {
                        if (c3 != null) {
                            if (c4 != null) {
                                final int h = c.h(this.f);
                                final int h2 = c2.h(this.f);
                                final int h3 = c3.h(this.f);
                                final int h4 = c4.h(this.f);
                                if (h < h3 && h2 < h4) {
                                    final HashMap<String, c>[] d = this.d;
                                    final HashMap<String, c> hashMap = d[n];
                                    d[n] = d[n2];
                                    d[n2] = hashMap;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static final class a extends InputStream implements DataInput
    {
        public static final ByteOrder J0;
        public static final ByteOrder K0;
        public DataInputStream F0;
        public ByteOrder G0;
        public final int H0;
        public int I0;
        
        static {
            J0 = ByteOrder.LITTLE_ENDIAN;
            K0 = ByteOrder.BIG_ENDIAN;
        }
        
        public a(final InputStream inputStream) throws IOException {
            this.G0 = ByteOrder.BIG_ENDIAN;
            final DataInputStream f0 = new DataInputStream(inputStream);
            this.F0 = f0;
            final int available = f0.available();
            this.H0 = available;
            this.I0 = 0;
            this.F0.mark(available);
        }
        
        public a(final byte[] array) throws IOException {
            this(new ByteArrayInputStream(array));
        }
        
        public final long a() throws IOException {
            return (long)this.readInt() & 0xFFFFFFFFL;
        }
        
        @Override
        public final int available() throws IOException {
            return this.F0.available();
        }
        
        public final void b(long n) throws IOException {
            final int i0 = this.I0;
            if (i0 > n) {
                this.I0 = 0;
                this.F0.reset();
                this.F0.mark(this.H0);
            }
            else {
                n -= i0;
            }
            final int n2 = (int)n;
            if (this.skipBytes(n2) == n2) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }
        
        @Override
        public final int read() throws IOException {
            ++this.I0;
            return this.F0.read();
        }
        
        @Override
        public final int read(final byte[] array, int read, final int n) throws IOException {
            read = this.F0.read(array, read, n);
            this.I0 += read;
            return read;
        }
        
        @Override
        public final boolean readBoolean() throws IOException {
            ++this.I0;
            return this.F0.readBoolean();
        }
        
        @Override
        public final byte readByte() throws IOException {
            final int i0 = this.I0 + 1;
            this.I0 = i0;
            if (i0 > this.H0) {
                throw new EOFException();
            }
            final int read = this.F0.read();
            if (read >= 0) {
                return (byte)read;
            }
            throw new EOFException();
        }
        
        @Override
        public final char readChar() throws IOException {
            this.I0 += 2;
            return this.F0.readChar();
        }
        
        @Override
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(this.readLong());
        }
        
        @Override
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(this.readInt());
        }
        
        @Override
        public final void readFully(final byte[] array) throws IOException {
            final int i0 = this.I0 + array.length;
            this.I0 = i0;
            if (i0 > this.H0) {
                throw new EOFException();
            }
            if (this.F0.read(array, 0, array.length) == array.length) {
                return;
            }
            throw new IOException("Couldn't read up to the length of buffer");
        }
        
        @Override
        public final void readFully(final byte[] array, final int n, final int n2) throws IOException {
            final int i0 = this.I0 + n2;
            this.I0 = i0;
            if (i0 > this.H0) {
                throw new EOFException();
            }
            if (this.F0.read(array, n, n2) == n2) {
                return;
            }
            throw new IOException("Couldn't read up to the length of buffer");
        }
        
        @Override
        public final int readInt() throws IOException {
            final int i0 = this.I0 + 4;
            this.I0 = i0;
            if (i0 > this.H0) {
                throw new EOFException();
            }
            final int read = this.F0.read();
            final int read2 = this.F0.read();
            final int read3 = this.F0.read();
            final int read4 = this.F0.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            final ByteOrder g0 = this.G0;
            if (g0 == a.J0) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (g0 == a.K0) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            final StringBuilder f = ehk.f("Invalid byte order: ");
            f.append(this.G0);
            throw new IOException(f.toString());
        }
        
        @Override
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }
        
        @Override
        public final long readLong() throws IOException {
            final int i0 = this.I0 + 8;
            this.I0 = i0;
            if (i0 > this.H0) {
                throw new EOFException();
            }
            final int read = this.F0.read();
            final int read2 = this.F0.read();
            final int read3 = this.F0.read();
            final int read4 = this.F0.read();
            final int read5 = this.F0.read();
            final int read6 = this.F0.read();
            final int read7 = this.F0.read();
            final int read8 = this.F0.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            final ByteOrder g0 = this.G0;
            if (g0 == a.J0) {
                return ((long)read8 << 56) + ((long)read7 << 48) + ((long)read6 << 40) + ((long)read5 << 32) + ((long)read4 << 24) + ((long)read3 << 16) + ((long)read2 << 8) + read;
            }
            if (g0 == a.K0) {
                return ((long)read << 56) + ((long)read2 << 48) + ((long)read3 << 40) + ((long)read4 << 32) + ((long)read5 << 24) + ((long)read6 << 16) + ((long)read7 << 8) + read8;
            }
            final StringBuilder f = ehk.f("Invalid byte order: ");
            f.append(this.G0);
            throw new IOException(f.toString());
        }
        
        @Override
        public final short readShort() throws IOException {
            final int i0 = this.I0 + 2;
            this.I0 = i0;
            if (i0 > this.H0) {
                throw new EOFException();
            }
            final int read = this.F0.read();
            final int read2 = this.F0.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder g0 = this.G0;
            if (g0 == a.J0) {
                return (short)((read2 << 8) + read);
            }
            if (g0 == a.K0) {
                return (short)((read << 8) + read2);
            }
            final StringBuilder f = ehk.f("Invalid byte order: ");
            f.append(this.G0);
            throw new IOException(f.toString());
        }
        
        @Override
        public final String readUTF() throws IOException {
            this.I0 += 2;
            return this.F0.readUTF();
        }
        
        @Override
        public final int readUnsignedByte() throws IOException {
            ++this.I0;
            return this.F0.readUnsignedByte();
        }
        
        @Override
        public final int readUnsignedShort() throws IOException {
            final int i0 = this.I0 + 2;
            this.I0 = i0;
            if (i0 > this.H0) {
                throw new EOFException();
            }
            final int read = this.F0.read();
            final int read2 = this.F0.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder g0 = this.G0;
            if (g0 == a.J0) {
                return (read2 << 8) + read;
            }
            if (g0 == a.K0) {
                return (read << 8) + read2;
            }
            final StringBuilder f = ehk.f("Invalid byte order: ");
            f.append(this.G0);
            throw new IOException(f.toString());
        }
        
        @Override
        public final int skipBytes(int i) throws IOException {
            int min;
            for (min = Math.min(i, this.H0 - this.I0), i = 0; i < min; i += this.F0.skipBytes(min - i)) {}
            this.I0 += i;
            return i;
        }
    }
    
    public static final class b extends FilterOutputStream
    {
        public final OutputStream F0;
        public ByteOrder G0;
        
        public b(final OutputStream f0) {
            final ByteOrder big_ENDIAN = ByteOrder.BIG_ENDIAN;
            super(f0);
            this.F0 = f0;
            this.G0 = big_ENDIAN;
        }
        
        public final void a(final int n) throws IOException {
            this.F0.write(n);
        }
        
        public final void b(final int n) throws IOException {
            final ByteOrder g0 = this.G0;
            if (g0 == ByteOrder.LITTLE_ENDIAN) {
                this.F0.write(n >>> 0 & 0xFF);
                this.F0.write(n >>> 8 & 0xFF);
                this.F0.write(n >>> 16 & 0xFF);
                this.F0.write(n >>> 24 & 0xFF);
            }
            else if (g0 == ByteOrder.BIG_ENDIAN) {
                this.F0.write(n >>> 24 & 0xFF);
                this.F0.write(n >>> 16 & 0xFF);
                this.F0.write(n >>> 8 & 0xFF);
                this.F0.write(n >>> 0 & 0xFF);
            }
        }
        
        public final void c(final short n) throws IOException {
            final ByteOrder g0 = this.G0;
            if (g0 == ByteOrder.LITTLE_ENDIAN) {
                this.F0.write(n >>> 0 & 0xFF);
                this.F0.write(n >>> 8 & 0xFF);
            }
            else if (g0 == ByteOrder.BIG_ENDIAN) {
                this.F0.write(n >>> 8 & 0xFF);
                this.F0.write(n >>> 0 & 0xFF);
            }
        }
        
        @Override
        public final void write(final byte[] array) throws IOException {
            this.F0.write(array);
        }
        
        @Override
        public final void write(final byte[] array, final int n, final int n2) throws IOException {
            this.F0.write(array, n, n2);
        }
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        public final byte[] c;
        
        public c(final int a, final int b, final byte[] c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static c a(final String s) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append('\0');
            final byte[] bytes = sb.toString().getBytes(rga.K);
            return new c(2, bytes.length, bytes);
        }
        
        public static c b(final long n, final ByteOrder byteOrder) {
            return c(new long[] { n }, byteOrder);
        }
        
        public static c c(final long[] array, final ByteOrder byteOrder) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[rga.z[4] * array.length]);
            wrap.order(byteOrder);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putInt((int)array[i]);
            }
            return new c(4, array.length, wrap.array());
        }
        
        public static c d(final e[] array, final ByteOrder byteOrder) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[rga.z[5] * array.length]);
            wrap.order(byteOrder);
            for (final e e : array) {
                wrap.putInt((int)e.a);
                wrap.putInt((int)e.b);
            }
            return new c(5, array.length, wrap.array());
        }
        
        public static c e(final int n, final ByteOrder byteOrder) {
            return f(new int[] { n }, byteOrder);
        }
        
        public static c f(final int[] array, final ByteOrder byteOrder) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[rga.z[3] * array.length]);
            wrap.order(byteOrder);
            for (int length = array.length, i = 0; i < length; ++i) {
                wrap.putShort((short)array[i]);
            }
            return new c(3, array.length, wrap.array());
        }
        
        public final double g(final ByteOrder byteOrder) {
            final Object j = this.j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (j instanceof String) {
                return Double.parseDouble((String)j);
            }
            if (j instanceof long[]) {
                final long[] array = (long[])j;
                if (array.length == 1) {
                    return (double)array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else if (j instanceof int[]) {
                final int[] array2 = (int[])j;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else if (j instanceof double[]) {
                final double[] array3 = (double[])j;
                if (array3.length == 1) {
                    return array3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else {
                if (!(j instanceof e[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                final e[] array4 = (e[])j;
                if (array4.length == 1) {
                    final e e = array4[0];
                    return e.a / (double)e.b;
                }
                throw new NumberFormatException("There are more than one component");
            }
        }
        
        public final int h(final ByteOrder byteOrder) {
            final Object j = this.j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (j instanceof String) {
                return Integer.parseInt((String)j);
            }
            if (j instanceof long[]) {
                final long[] array = (long[])j;
                if (array.length == 1) {
                    return (int)array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else {
                if (!(j instanceof int[])) {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
                final int[] array2 = (int[])j;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
        }
        
        public final String i(final ByteOrder byteOrder) {
            final Object j = this.j(byteOrder);
            if (j == null) {
                return null;
            }
            if (j instanceof String) {
                return (String)j;
            }
            final StringBuilder sb = new StringBuilder();
            final boolean b = j instanceof long[];
            int i = 0;
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            if (b) {
                final long[] array = (long[])j;
                int n4;
                for (int k = n3; k < array.length; k = n4) {
                    sb.append(array[k]);
                    n4 = k + 1;
                    if ((k = n4) != array.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (j instanceof int[]) {
                int n5;
                for (int[] array2 = (int[])j; i < array2.length; i = n5) {
                    sb.append(array2[i]);
                    n5 = i + 1;
                    if ((i = n5) != array2.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (j instanceof double[]) {
                final double[] array3 = (double[])j;
                int n6;
                for (int l = n; l < array3.length; l = n6) {
                    sb.append(array3[l]);
                    n6 = l + 1;
                    if ((l = n6) != array3.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (j instanceof e[]) {
                final e[] array4 = (e[])j;
                int n8;
                for (int n7 = n2; n7 < array4.length; n7 = n8) {
                    sb.append(array4[n7].a);
                    sb.append('/');
                    sb.append(array4[n7].b);
                    n8 = n7 + 1;
                    if ((n7 = n8) != array4.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            return null;
        }
        
        public final Object j(final ByteOrder p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: astore          13
            //     3: new             Lrga$a;
            //     6: astore          14
            //     8: aload           14
            //    10: aload_0        
            //    11: getfield        rga$c.c:[B
            //    14: invokespecial   rga$a.<init>:([B)V
            //    17: aload           14
            //    19: astore          13
            //    21: aload           14
            //    23: aload_1        
            //    24: putfield        rga$a.G0:Ljava/nio/ByteOrder;
            //    27: aload           14
            //    29: astore          13
            //    31: aload_0        
            //    32: getfield        rga$c.a:I
            //    35: istore          12
            //    37: iconst_1       
            //    38: istore          5
            //    40: iconst_0       
            //    41: istore          7
            //    43: iconst_0       
            //    44: istore          6
            //    46: iconst_0       
            //    47: istore          8
            //    49: iconst_0       
            //    50: istore_3       
            //    51: iconst_0       
            //    52: istore          10
            //    54: iconst_0       
            //    55: istore          9
            //    57: iconst_0       
            //    58: istore          11
            //    60: iconst_0       
            //    61: istore          4
            //    63: iconst_0       
            //    64: istore_2       
            //    65: iload           12
            //    67: tableswitch {
            //                2: 880
            //                3: 684
            //                4: 618
            //                5: 552
            //                6: 473
            //                7: 880
            //                8: 684
            //                9: 408
            //               10: 342
            //               11: 261
            //               12: 194
            //               13: 131
            //          default: 128
            //        }
            //   128: goto            997
            //   131: aload           14
            //   133: astore          13
            //   135: aload_0        
            //   136: getfield        rga$c.b:I
            //   139: newarray        D
            //   141: astore_1       
            //   142: aload           14
            //   144: astore          13
            //   146: iload_2        
            //   147: aload_0        
            //   148: getfield        rga$c.b:I
            //   151: if_icmpge       172
            //   154: aload           14
            //   156: astore          13
            //   158: aload_1        
            //   159: iload_2        
            //   160: aload           14
            //   162: invokevirtual   rga$a.readDouble:()D
            //   165: dastore        
            //   166: iinc            2, 1
            //   169: goto            142
            //   172: aload           14
            //   174: invokevirtual   java/io/InputStream.close:()V
            //   177: goto            192
            //   180: astore          13
            //   182: ldc             "ExifInterface"
            //   184: ldc             "IOException occurred while closing InputStream"
            //   186: aload           13
            //   188: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   191: pop            
            //   192: aload_1        
            //   193: areturn        
            //   194: aload           14
            //   196: astore          13
            //   198: aload_0        
            //   199: getfield        rga$c.b:I
            //   202: newarray        D
            //   204: astore_1       
            //   205: iload           7
            //   207: istore_2       
            //   208: aload           14
            //   210: astore          13
            //   212: iload_2        
            //   213: aload_0        
            //   214: getfield        rga$c.b:I
            //   217: if_icmpge       239
            //   220: aload           14
            //   222: astore          13
            //   224: aload_1        
            //   225: iload_2        
            //   226: aload           14
            //   228: invokevirtual   rga$a.readFloat:()F
            //   231: f2d            
            //   232: dastore        
            //   233: iinc            2, 1
            //   236: goto            208
            //   239: aload           14
            //   241: invokevirtual   java/io/InputStream.close:()V
            //   244: goto            259
            //   247: astore          13
            //   249: ldc             "ExifInterface"
            //   251: ldc             "IOException occurred while closing InputStream"
            //   253: aload           13
            //   255: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   258: pop            
            //   259: aload_1        
            //   260: areturn        
            //   261: aload           14
            //   263: astore          13
            //   265: aload_0        
            //   266: getfield        rga$c.b:I
            //   269: anewarray       Lrga$e;
            //   272: astore_1       
            //   273: iload           6
            //   275: istore_2       
            //   276: aload           14
            //   278: astore          13
            //   280: iload_2        
            //   281: aload_0        
            //   282: getfield        rga$c.b:I
            //   285: if_icmpge       320
            //   288: aload           14
            //   290: astore          13
            //   292: aload_1        
            //   293: iload_2        
            //   294: new             Lrga$e;
            //   297: dup            
            //   298: aload           14
            //   300: invokevirtual   rga$a.readInt:()I
            //   303: i2l            
            //   304: aload           14
            //   306: invokevirtual   rga$a.readInt:()I
            //   309: i2l            
            //   310: invokespecial   rga$e.<init>:(JJ)V
            //   313: aastore        
            //   314: iinc            2, 1
            //   317: goto            276
            //   320: aload           14
            //   322: invokevirtual   java/io/InputStream.close:()V
            //   325: goto            340
            //   328: astore          13
            //   330: ldc             "ExifInterface"
            //   332: ldc             "IOException occurred while closing InputStream"
            //   334: aload           13
            //   336: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   339: pop            
            //   340: aload_1        
            //   341: areturn        
            //   342: aload           14
            //   344: astore          13
            //   346: aload_0        
            //   347: getfield        rga$c.b:I
            //   350: newarray        I
            //   352: astore_1       
            //   353: iload           8
            //   355: istore_2       
            //   356: aload           14
            //   358: astore          13
            //   360: iload_2        
            //   361: aload_0        
            //   362: getfield        rga$c.b:I
            //   365: if_icmpge       386
            //   368: aload           14
            //   370: astore          13
            //   372: aload_1        
            //   373: iload_2        
            //   374: aload           14
            //   376: invokevirtual   rga$a.readInt:()I
            //   379: iastore        
            //   380: iinc            2, 1
            //   383: goto            356
            //   386: aload           14
            //   388: invokevirtual   java/io/InputStream.close:()V
            //   391: goto            406
            //   394: astore          13
            //   396: ldc             "ExifInterface"
            //   398: ldc             "IOException occurred while closing InputStream"
            //   400: aload           13
            //   402: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   405: pop            
            //   406: aload_1        
            //   407: areturn        
            //   408: aload           14
            //   410: astore          13
            //   412: aload_0        
            //   413: getfield        rga$c.b:I
            //   416: newarray        I
            //   418: astore_1       
            //   419: iload_3        
            //   420: istore_2       
            //   421: aload           14
            //   423: astore          13
            //   425: iload_2        
            //   426: aload_0        
            //   427: getfield        rga$c.b:I
            //   430: if_icmpge       451
            //   433: aload           14
            //   435: astore          13
            //   437: aload_1        
            //   438: iload_2        
            //   439: aload           14
            //   441: invokevirtual   rga$a.readShort:()S
            //   444: iastore        
            //   445: iinc            2, 1
            //   448: goto            421
            //   451: aload           14
            //   453: invokevirtual   java/io/InputStream.close:()V
            //   456: goto            471
            //   459: astore          13
            //   461: ldc             "ExifInterface"
            //   463: ldc             "IOException occurred while closing InputStream"
            //   465: aload           13
            //   467: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   470: pop            
            //   471: aload_1        
            //   472: areturn        
            //   473: aload           14
            //   475: astore          13
            //   477: aload_0        
            //   478: getfield        rga$c.b:I
            //   481: anewarray       Lrga$e;
            //   484: astore_1       
            //   485: iload           10
            //   487: istore_2       
            //   488: aload           14
            //   490: astore          13
            //   492: iload_2        
            //   493: aload_0        
            //   494: getfield        rga$c.b:I
            //   497: if_icmpge       530
            //   500: aload           14
            //   502: astore          13
            //   504: aload_1        
            //   505: iload_2        
            //   506: new             Lrga$e;
            //   509: dup            
            //   510: aload           14
            //   512: invokevirtual   rga$a.a:()J
            //   515: aload           14
            //   517: invokevirtual   rga$a.a:()J
            //   520: invokespecial   rga$e.<init>:(JJ)V
            //   523: aastore        
            //   524: iinc            2, 1
            //   527: goto            488
            //   530: aload           14
            //   532: invokevirtual   java/io/InputStream.close:()V
            //   535: goto            550
            //   538: astore          13
            //   540: ldc             "ExifInterface"
            //   542: ldc             "IOException occurred while closing InputStream"
            //   544: aload           13
            //   546: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   549: pop            
            //   550: aload_1        
            //   551: areturn        
            //   552: aload           14
            //   554: astore          13
            //   556: aload_0        
            //   557: getfield        rga$c.b:I
            //   560: newarray        J
            //   562: astore_1       
            //   563: iload           9
            //   565: istore_2       
            //   566: aload           14
            //   568: astore          13
            //   570: iload_2        
            //   571: aload_0        
            //   572: getfield        rga$c.b:I
            //   575: if_icmpge       596
            //   578: aload           14
            //   580: astore          13
            //   582: aload_1        
            //   583: iload_2        
            //   584: aload           14
            //   586: invokevirtual   rga$a.a:()J
            //   589: lastore        
            //   590: iinc            2, 1
            //   593: goto            566
            //   596: aload           14
            //   598: invokevirtual   java/io/InputStream.close:()V
            //   601: goto            616
            //   604: astore          13
            //   606: ldc             "ExifInterface"
            //   608: ldc             "IOException occurred while closing InputStream"
            //   610: aload           13
            //   612: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   615: pop            
            //   616: aload_1        
            //   617: areturn        
            //   618: aload           14
            //   620: astore          13
            //   622: aload_0        
            //   623: getfield        rga$c.b:I
            //   626: newarray        I
            //   628: astore_1       
            //   629: iload           11
            //   631: istore_2       
            //   632: aload           14
            //   634: astore          13
            //   636: iload_2        
            //   637: aload_0        
            //   638: getfield        rga$c.b:I
            //   641: if_icmpge       662
            //   644: aload           14
            //   646: astore          13
            //   648: aload_1        
            //   649: iload_2        
            //   650: aload           14
            //   652: invokevirtual   rga$a.readUnsignedShort:()I
            //   655: iastore        
            //   656: iinc            2, 1
            //   659: goto            632
            //   662: aload           14
            //   664: invokevirtual   java/io/InputStream.close:()V
            //   667: goto            682
            //   670: astore          13
            //   672: ldc             "ExifInterface"
            //   674: ldc             "IOException occurred while closing InputStream"
            //   676: aload           13
            //   678: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   681: pop            
            //   682: aload_1        
            //   683: areturn        
            //   684: iload           4
            //   686: istore_2       
            //   687: aload           14
            //   689: astore          13
            //   691: aload_0        
            //   692: getfield        rga$c.b:I
            //   695: getstatic       rga.A:[B
            //   698: arraylength    
            //   699: if_icmplt       766
            //   702: iconst_0       
            //   703: istore_2       
            //   704: aload           14
            //   706: astore          13
            //   708: getstatic       rga.A:[B
            //   711: astore_1       
            //   712: iload           5
            //   714: istore_3       
            //   715: aload           14
            //   717: astore          13
            //   719: iload_2        
            //   720: aload_1        
            //   721: arraylength    
            //   722: if_icmpge       752
            //   725: aload           14
            //   727: astore          13
            //   729: aload_0        
            //   730: getfield        rga$c.c:[B
            //   733: iload_2        
            //   734: baload         
            //   735: aload_1        
            //   736: iload_2        
            //   737: baload         
            //   738: if_icmpeq       746
            //   741: iconst_0       
            //   742: istore_3       
            //   743: goto            752
            //   746: iinc            2, 1
            //   749: goto            704
            //   752: iload           4
            //   754: istore_2       
            //   755: iload_3        
            //   756: ifeq            766
            //   759: aload           14
            //   761: astore          13
            //   763: aload_1        
            //   764: arraylength    
            //   765: istore_2       
            //   766: aload           14
            //   768: astore          13
            //   770: new             Ljava/lang/StringBuilder;
            //   773: astore_1       
            //   774: aload           14
            //   776: astore          13
            //   778: aload_1        
            //   779: invokespecial   java/lang/StringBuilder.<init>:()V
            //   782: aload           14
            //   784: astore          13
            //   786: iload_2        
            //   787: aload_0        
            //   788: getfield        rga$c.b:I
            //   791: if_icmpge       849
            //   794: aload           14
            //   796: astore          13
            //   798: aload_0        
            //   799: getfield        rga$c.c:[B
            //   802: iload_2        
            //   803: baload         
            //   804: istore_3       
            //   805: iload_3        
            //   806: ifne            812
            //   809: goto            849
            //   812: iload_3        
            //   813: bipush          32
            //   815: if_icmplt       832
            //   818: aload           14
            //   820: astore          13
            //   822: aload_1        
            //   823: iload_3        
            //   824: i2c            
            //   825: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
            //   828: pop            
            //   829: goto            843
            //   832: aload           14
            //   834: astore          13
            //   836: aload_1        
            //   837: bipush          63
            //   839: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
            //   842: pop            
            //   843: iinc            2, 1
            //   846: goto            782
            //   849: aload           14
            //   851: astore          13
            //   853: aload_1        
            //   854: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   857: astore_1       
            //   858: aload           14
            //   860: invokevirtual   java/io/InputStream.close:()V
            //   863: goto            878
            //   866: astore          13
            //   868: ldc             "ExifInterface"
            //   870: ldc             "IOException occurred while closing InputStream"
            //   872: aload           13
            //   874: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   877: pop            
            //   878: aload_1        
            //   879: areturn        
            //   880: aload           14
            //   882: astore          13
            //   884: aload_0        
            //   885: getfield        rga$c.c:[B
            //   888: astore_1       
            //   889: aload           14
            //   891: astore          13
            //   893: aload_1        
            //   894: arraylength    
            //   895: iconst_1       
            //   896: if_icmpne       959
            //   899: aload_1        
            //   900: iconst_0       
            //   901: baload         
            //   902: iflt            959
            //   905: aload_1        
            //   906: iconst_0       
            //   907: baload         
            //   908: iconst_1       
            //   909: if_icmpgt       959
            //   912: aload           14
            //   914: astore          13
            //   916: new             Ljava/lang/String;
            //   919: dup            
            //   920: iconst_1       
            //   921: newarray        C
            //   923: dup            
            //   924: iconst_0       
            //   925: aload_1        
            //   926: iconst_0       
            //   927: baload         
            //   928: bipush          48
            //   930: iadd           
            //   931: i2c            
            //   932: castore        
            //   933: invokespecial   java/lang/String.<init>:([C)V
            //   936: astore_1       
            //   937: aload           14
            //   939: invokevirtual   java/io/InputStream.close:()V
            //   942: goto            957
            //   945: astore          13
            //   947: ldc             "ExifInterface"
            //   949: ldc             "IOException occurred while closing InputStream"
            //   951: aload           13
            //   953: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   956: pop            
            //   957: aload_1        
            //   958: areturn        
            //   959: aload           14
            //   961: astore          13
            //   963: new             Ljava/lang/String;
            //   966: dup            
            //   967: aload_1        
            //   968: getstatic       rga.K:Ljava/nio/charset/Charset;
            //   971: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
            //   974: astore_1       
            //   975: aload           14
            //   977: invokevirtual   java/io/InputStream.close:()V
            //   980: goto            995
            //   983: astore          13
            //   985: ldc             "ExifInterface"
            //   987: ldc             "IOException occurred while closing InputStream"
            //   989: aload           13
            //   991: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //   994: pop            
            //   995: aload_1        
            //   996: areturn        
            //   997: aload           14
            //   999: invokevirtual   java/io/InputStream.close:()V
            //  1002: goto            1015
            //  1005: astore_1       
            //  1006: ldc             "ExifInterface"
            //  1008: ldc             "IOException occurred while closing InputStream"
            //  1010: aload_1        
            //  1011: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //  1014: pop            
            //  1015: aconst_null    
            //  1016: areturn        
            //  1017: astore          13
            //  1019: aload           14
            //  1021: astore_1       
            //  1022: aload           13
            //  1024: astore          14
            //  1026: goto            1037
            //  1029: astore_1       
            //  1030: goto            1074
            //  1033: astore          14
            //  1035: aconst_null    
            //  1036: astore_1       
            //  1037: aload_1        
            //  1038: astore          13
            //  1040: ldc             "ExifInterface"
            //  1042: ldc             "IOException occurred during reading a value"
            //  1044: aload           14
            //  1046: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //  1049: pop            
            //  1050: aload_1        
            //  1051: ifnull          1071
            //  1054: aload_1        
            //  1055: invokevirtual   java/io/InputStream.close:()V
            //  1058: goto            1071
            //  1061: astore_1       
            //  1062: ldc             "ExifInterface"
            //  1064: ldc             "IOException occurred while closing InputStream"
            //  1066: aload_1        
            //  1067: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //  1070: pop            
            //  1071: aconst_null    
            //  1072: areturn        
            //  1073: astore_1       
            //  1074: aload           13
            //  1076: ifnull          1099
            //  1079: aload           13
            //  1081: invokevirtual   java/io/InputStream.close:()V
            //  1084: goto            1099
            //  1087: astore          13
            //  1089: ldc             "ExifInterface"
            //  1091: ldc             "IOException occurred while closing InputStream"
            //  1093: aload           13
            //  1095: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
            //  1098: pop            
            //  1099: aload_1        
            //  1100: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  3      17     1033   1037   Ljava/io/IOException;
            //  3      17     1029   1033   Any
            //  21     27     1017   1029   Ljava/io/IOException;
            //  21     27     1073   1074   Any
            //  31     37     1017   1029   Ljava/io/IOException;
            //  31     37     1073   1074   Any
            //  135    142    1017   1029   Ljava/io/IOException;
            //  135    142    1073   1074   Any
            //  146    154    1017   1029   Ljava/io/IOException;
            //  146    154    1073   1074   Any
            //  158    166    1017   1029   Ljava/io/IOException;
            //  158    166    1073   1074   Any
            //  172    177    180    192    Ljava/io/IOException;
            //  198    205    1017   1029   Ljava/io/IOException;
            //  198    205    1073   1074   Any
            //  212    220    1017   1029   Ljava/io/IOException;
            //  212    220    1073   1074   Any
            //  224    233    1017   1029   Ljava/io/IOException;
            //  224    233    1073   1074   Any
            //  239    244    247    259    Ljava/io/IOException;
            //  265    273    1017   1029   Ljava/io/IOException;
            //  265    273    1073   1074   Any
            //  280    288    1017   1029   Ljava/io/IOException;
            //  280    288    1073   1074   Any
            //  292    314    1017   1029   Ljava/io/IOException;
            //  292    314    1073   1074   Any
            //  320    325    328    340    Ljava/io/IOException;
            //  346    353    1017   1029   Ljava/io/IOException;
            //  346    353    1073   1074   Any
            //  360    368    1017   1029   Ljava/io/IOException;
            //  360    368    1073   1074   Any
            //  372    380    1017   1029   Ljava/io/IOException;
            //  372    380    1073   1074   Any
            //  386    391    394    406    Ljava/io/IOException;
            //  412    419    1017   1029   Ljava/io/IOException;
            //  412    419    1073   1074   Any
            //  425    433    1017   1029   Ljava/io/IOException;
            //  425    433    1073   1074   Any
            //  437    445    1017   1029   Ljava/io/IOException;
            //  437    445    1073   1074   Any
            //  451    456    459    471    Ljava/io/IOException;
            //  477    485    1017   1029   Ljava/io/IOException;
            //  477    485    1073   1074   Any
            //  492    500    1017   1029   Ljava/io/IOException;
            //  492    500    1073   1074   Any
            //  504    524    1017   1029   Ljava/io/IOException;
            //  504    524    1073   1074   Any
            //  530    535    538    550    Ljava/io/IOException;
            //  556    563    1017   1029   Ljava/io/IOException;
            //  556    563    1073   1074   Any
            //  570    578    1017   1029   Ljava/io/IOException;
            //  570    578    1073   1074   Any
            //  582    590    1017   1029   Ljava/io/IOException;
            //  582    590    1073   1074   Any
            //  596    601    604    616    Ljava/io/IOException;
            //  622    629    1017   1029   Ljava/io/IOException;
            //  622    629    1073   1074   Any
            //  636    644    1017   1029   Ljava/io/IOException;
            //  636    644    1073   1074   Any
            //  648    656    1017   1029   Ljava/io/IOException;
            //  648    656    1073   1074   Any
            //  662    667    670    682    Ljava/io/IOException;
            //  691    702    1017   1029   Ljava/io/IOException;
            //  691    702    1073   1074   Any
            //  708    712    1017   1029   Ljava/io/IOException;
            //  708    712    1073   1074   Any
            //  719    725    1017   1029   Ljava/io/IOException;
            //  719    725    1073   1074   Any
            //  729    741    1017   1029   Ljava/io/IOException;
            //  729    741    1073   1074   Any
            //  763    766    1017   1029   Ljava/io/IOException;
            //  763    766    1073   1074   Any
            //  770    774    1017   1029   Ljava/io/IOException;
            //  770    774    1073   1074   Any
            //  778    782    1017   1029   Ljava/io/IOException;
            //  778    782    1073   1074   Any
            //  786    794    1017   1029   Ljava/io/IOException;
            //  786    794    1073   1074   Any
            //  798    805    1017   1029   Ljava/io/IOException;
            //  798    805    1073   1074   Any
            //  822    829    1017   1029   Ljava/io/IOException;
            //  822    829    1073   1074   Any
            //  836    843    1017   1029   Ljava/io/IOException;
            //  836    843    1073   1074   Any
            //  853    858    1017   1029   Ljava/io/IOException;
            //  853    858    1073   1074   Any
            //  858    863    866    878    Ljava/io/IOException;
            //  884    889    1017   1029   Ljava/io/IOException;
            //  884    889    1073   1074   Any
            //  893    899    1017   1029   Ljava/io/IOException;
            //  893    899    1073   1074   Any
            //  916    937    1017   1029   Ljava/io/IOException;
            //  916    937    1073   1074   Any
            //  937    942    945    957    Ljava/io/IOException;
            //  963    975    1017   1029   Ljava/io/IOException;
            //  963    975    1073   1074   Any
            //  975    980    983    995    Ljava/io/IOException;
            //  997    1002   1005   1015   Ljava/io/IOException;
            //  1040   1050   1073   1074   Any
            //  1054   1058   1061   1071   Ljava/io/IOException;
            //  1079   1084   1087   1099   Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0128:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("(");
            f.append(rga.y[this.a]);
            f.append(", data length:");
            return ad.y(f, this.c.length, ")");
        }
    }
    
    public static final class d
    {
        public final int a;
        public final String b;
        public final int c;
        public final int d;
        
        public d(final String b, final int a) {
            this.b = b;
            this.a = a;
            this.c = 3;
            this.d = 4;
        }
        
        public d(final String b, final int a, final int c) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = -1;
        }
    }
    
    public static final class e
    {
        public final long a;
        public final long b;
        
        public e(final long a, final long b) {
            if (b == 0L) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("/");
            sb.append(this.b);
            return sb.toString();
        }
    }
}
