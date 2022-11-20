import java.nio.ShortBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.view.Display$Mode;
import android.view.Display;
import android.util.Log;
import java.util.Objects;
import android.view.WindowManager;
import android.hardware.display.DisplayManager;
import android.graphics.Point;
import android.os.Handler$Callback;
import java.io.Closeable;
import java.util.Collections;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import android.content.ComponentName;
import android.content.Intent;
import java.util.List;
import android.os.Looper;
import android.os.Handler;
import java.util.regex.Matcher;
import java.math.BigDecimal;
import android.text.TextUtils;
import java.util.GregorianCalendar;
import j$.util.DesugarTimeZone;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import android.app.UiModeManager;
import android.content.Context;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.Locale;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnw
{
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final Pattern g;
    public static final Pattern h;
    public static HashMap<String, String> i;
    public static final String[] j;
    public static final String[] k;
    public static final int[] l;
    public static final int[] m;
    
    static {
        final int n = a = Build$VERSION.SDK_INT;
        final String s = b = Build.DEVICE;
        final String s2 = c = Build.MANUFACTURER;
        final String s3 = d = Build.MODEL;
        final StringBuilder d2 = x70.D(wnj.f(s2, wnj.f(s3, wnj.f(s, 17))), s, ", ", s3, ", ");
        d2.append(s2);
        d2.append(", ");
        d2.append(n);
        e = d2.toString();
        f = new byte[0];
        g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        h = Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        j = new String[] { "alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn" };
        k = new String[] { "i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn" };
        l = $d2j$hex$fcd2dfd9$decode_I("00000000b71dc1046e3b8209d926430ddc7604136b6bc517b24d861a0550471eb8ed08260ff0c922d6d68a2f61cb4b2b649b0c35d386cd310aa08e3cbdbd4f3870db114cc7c6d0481ee09345a9fd5241acad155f1bb0d45bc2969756758b5652c836196a7f2bd86ea60d9b6311105a6714401d79a35ddc7d7a7b9f70cd665e74e0b6239857abe29c8e8da191399060953cc0278b8bdde68f52fba582e5e66486585b2bbeef46eaba3660a9b7817d68b3842d2fad3330eea9ea16ada45d0b6ca0906d32d42770f3d0fe56b0dd494b71d94c1b36c7fb06f7c32220b4ce953d75ca28803af29f9dfbf646bbb8fbf1a679fff4f63ee143ebffe59acdbce82dd07dec77708634c06d4730194b043dae56c539ab0682271c1b4323c53d002e7220c12acf9d8e1278804f16a1a60c1b16bbcd1f13eb8a01a4f64b057dd00808cacdc90c07ab9778b0b6567c69901571de8dd475dbdd936b6cc0526fb5e6116202fbd066bf469f5e085b5e5ad17d1d576660dc5363309b4dd42d5a490d0b1944ba16d84097c6a5ac20db64a8f9fd27a54ee0e6a14bb0a1bffcad60bb258b23b69296e2b22f2bad8a98366c8e41102f83f60dee87f35da9994440689d9d662b902a7bea94e71db4e0500075e4892636e93e3bf7ed3b6bb0f38c7671f7555032fae24df3fe5ff0bcc6e8ed7dc231cb3ecf86d6ffcb8386b8d5349b79d1edbd3adc5aa0fbd8eee00c6959fdcd6d80db8e6037c64f643296087a858bc97e5cad8a73ebb04b77560d044fe110c54b383686468f2b47428a7b005c3d66c158e4408255535d43519e3b1d252926dc21f0009f2c471d5e28424d1936f550d8322c769b3f9b6b5a3b26d6150391cbd40748ed970afff0560efaa011104dbdd014949b93192386521d0e562ff1b94beef5606dadf8d7706cfcd2202be2653deae6bc1ba9eb0b0668efb6bb27d701a6e6d3d880a5de6f9d64da6acd23c4ddd0e2c004f6a1cdb3eb60c97e8d3ebdc990ffb910b6bcb4a7ab7db0a2fb3aae15e6fbaaccc0b8a77bdd79a3c660369b717df79fa85bb4921f4675961a163288ad0bf38c742db081c330718599908a5d2e8d4b59f7ab085440b6c95045e68e4ef2fb4f4a2bdd0c479cc0cd43217d827b9660437f4f460072f85bc176fd0b86684a16476c93300461242dc565e94b9b115e565a1587701918306dd81c353d9f0282205e065b061d0bec1bdc0f51a69337e6bb52333f9d113e8880d03a8dd097243acd5620e3eb152d54f6d4297926a9c5ce3b68c1171d2bcca000eac8a550add6124d6cd2cb6b2fdf7c76eedbc1cba1e376d660e7aff023ea18ede2ee1dbda5f0aaa064f4738627f9c49be6fd09fdb889bee0798d67c63a80d0dbfb84d58bbc9a62967d9ebbb03e930cadff97b110b0af060d71abdf2b32a66836f3a26d66b4bcda7b75b8035d36b5b440f7b1");
        m = $d2j$hex$fcd2dfd9$decode_I("00000000070000000e000000090000001c0000001b0000001200000015000000380000003f000000360000003100000024000000230000002a0000002d00000070000000770000007e000000790000006c0000006b0000006200000065000000480000004f000000460000004100000054000000530000005a0000005d000000e0000000e7000000ee000000e9000000fc000000fb000000f2000000f5000000d8000000df000000d6000000d1000000c4000000c3000000ca000000cd00000090000000970000009e000000990000008c0000008b0000008200000085000000a8000000af000000a6000000a1000000b4000000b3000000ba000000bd000000c7000000c0000000c9000000ce000000db000000dc000000d5000000d2000000ff000000f8000000f1000000f6000000e3000000e4000000ed000000ea000000b7000000b0000000b9000000be000000ab000000ac000000a5000000a20000008f00000088000000810000008600000093000000940000009d0000009a0000002700000020000000290000002e0000003b0000003c00000035000000320000001f00000018000000110000001600000003000000040000000d0000000a0000005700000050000000590000005e0000004b0000004c00000045000000420000006f00000068000000610000006600000073000000740000007d0000007a000000890000008e000000870000008000000095000000920000009b0000009c000000b1000000b6000000bf000000b8000000ad000000aa000000a3000000a4000000f9000000fe000000f7000000f0000000e5000000e2000000eb000000ec000000c1000000c6000000cf000000c8000000dd000000da000000d3000000d4000000690000006e000000670000006000000075000000720000007b0000007c00000051000000560000005f000000580000004d0000004a0000004300000044000000190000001e000000170000001000000005000000020000000b0000000c00000021000000260000002f000000280000003d0000003a00000033000000340000004e00000049000000400000004700000052000000550000005c0000005b0000007600000071000000780000007f0000006a0000006d00000064000000630000003e00000039000000300000003700000022000000250000002c0000002b0000000600000001000000080000000f0000001a0000001d0000001400000013000000ae000000a9000000a0000000a7000000b2000000b5000000bc000000bb0000009600000091000000980000009f0000008a0000008d0000008400000083000000de000000d9000000d0000000d7000000c2000000c5000000cc000000cb000000e6000000e1000000e8000000ef000000fa000000fd000000f4000000f3000000");
    }
    
    public static String[] A() {
        final Configuration configuration = Resources.getSystem().getConfiguration();
        final int a = cnw.a;
        int i = 0;
        String[] split;
        if (a >= 24) {
            split = configuration.getLocales().toLanguageTags().split(",", -1);
        }
        else {
            final Locale locale = configuration.locale;
            String s;
            if (a >= 21) {
                s = locale.toLanguageTag();
            }
            else {
                s = locale.toString();
            }
            split = new String[] { s };
        }
        while (i < split.length) {
            split[i] = I(split[i]);
            ++i;
        }
        return split;
    }
    
    public static String B(String concat) {
        try {
            final Class<?> forName = Class.forName("android.os.SystemProperties");
            return (String)forName.getMethod("get", String.class).invoke(forName, concat);
        }
        catch (final Exception ex) {
            if (concat.length() != 0) {
                concat = "Failed to read system property ".concat(concat);
            }
            else {
                concat = new String("Failed to read system property ");
            }
            g63.s("Util", concat, (Throwable)ex);
            return null;
        }
    }
    
    public static byte[] C(final String s) {
        return s.getBytes(it3.c);
    }
    
    public static boolean D(final rwj rwj, final rwj rwj2, final Inflater inflater) {
        final int n = rwj.c - rwj.b;
        if (n <= 0) {
            return false;
        }
        if (rwj2.a.length < n) {
            rwj2.a(n * 2);
        }
        Inflater inflater2;
        if ((inflater2 = inflater) == null) {
            inflater2 = new Inflater();
        }
        final byte[] a = rwj.a;
        final int b = rwj.b;
        inflater2.setInput(a, b, rwj.c - b);
        int n2 = 0;
        try {
            while (true) {
                final byte[] a2 = rwj2.a;
                final int n3 = n2 + inflater2.inflate(a2, n2, a2.length - n2);
                if (inflater2.finished()) {
                    rwj2.C(n3);
                    return true;
                }
                if (inflater2.needsDictionary() || inflater2.needsInput()) {
                    return false;
                }
                final byte[] a3 = rwj2.a;
                if ((n2 = n3) != a3.length) {
                    continue;
                }
                rwj2.a(a3.length * 2);
                n2 = n3;
            }
        }
        catch (final DataFormatException ex) {
            return false;
        }
        finally {
            inflater2.reset();
        }
    }
    
    public static boolean E(final int n) {
        return n == 3 || n == 2 || n == 268435456 || n == 536870912 || n == 805306368 || n == 4;
    }
    
    public static boolean F(final int n) {
        return n == 10 || n == 13;
    }
    
    public static boolean G(final Context context) {
        final UiModeManager uiModeManager = (UiModeManager)context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }
    
    public static long H(final long n) {
        long n2 = n;
        if (n != -9223372036854775807L) {
            if (n == Long.MIN_VALUE) {
                n2 = n;
            }
            else {
                n2 = n * 1000L;
            }
        }
        return n2;
    }
    
    public static String I(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: aload_0        
        //     7: bipush          95
        //     9: bipush          45
        //    11: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //    14: astore          5
        //    16: aload_0        
        //    17: astore          4
        //    19: aload           5
        //    21: invokevirtual   java/lang/String.isEmpty:()Z
        //    24: ifne            48
        //    27: aload           5
        //    29: ldc_w           "und"
        //    32: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    35: ifeq            44
        //    38: aload_0        
        //    39: astore          4
        //    41: goto            48
        //    44: aload           5
        //    46: astore          4
        //    48: aload           4
        //    50: invokestatic    mru.s:(Ljava/lang/String;)Ljava/lang/String;
        //    53: astore          4
        //    55: aload           4
        //    57: ldc_w           "-"
        //    60: iconst_2       
        //    61: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //    64: astore_0       
        //    65: iconst_0       
        //    66: istore_2       
        //    67: aload_0        
        //    68: iconst_0       
        //    69: aaload         
        //    70: astore          6
        //    72: getstatic       cnw.i:Ljava/util/HashMap;
        //    75: ifnonnull       197
        //    78: invokestatic    java/util/Locale.getISOLanguages:()[Ljava/lang/String;
        //    81: astore          5
        //    83: new             Ljava/util/HashMap;
        //    86: dup            
        //    87: aload           5
        //    89: arraylength    
        //    90: getstatic       cnw.j:[Ljava/lang/String;
        //    93: arraylength    
        //    94: iadd           
        //    95: invokespecial   java/util/HashMap.<init>:(I)V
        //    98: astore_0       
        //    99: aload           5
        //   101: arraylength    
        //   102: istore_3       
        //   103: iconst_0       
        //   104: istore_1       
        //   105: iload_1        
        //   106: iload_3        
        //   107: if_icmpge       158
        //   110: aload           5
        //   112: iload_1        
        //   113: aaload         
        //   114: astore          7
        //   116: new             Ljava/util/Locale;
        //   119: astore          8
        //   121: aload           8
        //   123: aload           7
        //   125: invokespecial   java/util/Locale.<init>:(Ljava/lang/String;)V
        //   128: aload           8
        //   130: invokevirtual   java/util/Locale.getISO3Language:()Ljava/lang/String;
        //   133: astore          8
        //   135: aload           8
        //   137: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   140: ifne            152
        //   143: aload_0        
        //   144: aload           8
        //   146: aload           7
        //   148: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   151: pop            
        //   152: iinc            1, 1
        //   155: goto            105
        //   158: iconst_0       
        //   159: istore_1       
        //   160: getstatic       cnw.j:[Ljava/lang/String;
        //   163: astore          5
        //   165: iload_1        
        //   166: aload           5
        //   168: arraylength    
        //   169: if_icmpge       193
        //   172: aload_0        
        //   173: aload           5
        //   175: iload_1        
        //   176: aaload         
        //   177: aload           5
        //   179: iload_1        
        //   180: iconst_1       
        //   181: iadd           
        //   182: aaload         
        //   183: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   186: pop            
        //   187: iinc            1, 2
        //   190: goto            160
        //   193: aload_0        
        //   194: putstatic       cnw.i:Ljava/util/HashMap;
        //   197: getstatic       cnw.i:Ljava/util/HashMap;
        //   200: aload           6
        //   202: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   205: checkcast       Ljava/lang/String;
        //   208: astore          7
        //   210: aload           6
        //   212: astore          5
        //   214: aload           4
        //   216: astore_0       
        //   217: aload           7
        //   219: ifnull          267
        //   222: aload           4
        //   224: aload           6
        //   226: invokevirtual   java/lang/String.length:()I
        //   229: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   232: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   235: astore_0       
        //   236: aload_0        
        //   237: invokevirtual   java/lang/String.length:()I
        //   240: ifeq            253
        //   243: aload           7
        //   245: aload_0        
        //   246: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   249: astore_0       
        //   250: goto            263
        //   253: new             Ljava/lang/String;
        //   256: dup            
        //   257: aload           7
        //   259: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   262: astore_0       
        //   263: aload           7
        //   265: astore          5
        //   267: iload_2        
        //   268: istore_1       
        //   269: ldc_w           "no"
        //   272: aload           5
        //   274: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   277: ifne            308
        //   280: iload_2        
        //   281: istore_1       
        //   282: ldc_w           "i"
        //   285: aload           5
        //   287: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   290: ifne            308
        //   293: aload_0        
        //   294: astore          4
        //   296: ldc             "zh"
        //   298: aload           5
        //   300: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   303: ifeq            398
        //   306: iload_2        
        //   307: istore_1       
        //   308: getstatic       cnw.k:[Ljava/lang/String;
        //   311: astore          5
        //   313: aload_0        
        //   314: astore          4
        //   316: iload_1        
        //   317: aload           5
        //   319: arraylength    
        //   320: if_icmpge       398
        //   323: aload_0        
        //   324: aload           5
        //   326: iload_1        
        //   327: aaload         
        //   328: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   331: ifeq            392
        //   334: aload           5
        //   336: iload_1        
        //   337: iconst_1       
        //   338: iadd           
        //   339: aaload         
        //   340: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   343: astore          4
        //   345: aload_0        
        //   346: aload           5
        //   348: iload_1        
        //   349: aaload         
        //   350: invokevirtual   java/lang/String.length:()I
        //   353: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   356: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   359: astore_0       
        //   360: aload_0        
        //   361: invokevirtual   java/lang/String.length:()I
        //   364: ifeq            378
        //   367: aload           4
        //   369: aload_0        
        //   370: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   373: astore          4
        //   375: goto            398
        //   378: new             Ljava/lang/String;
        //   381: dup            
        //   382: aload           4
        //   384: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   387: astore          4
        //   389: goto            398
        //   392: iinc            1, 2
        //   395: goto            308
        //   398: aload           4
        //   400: areturn        
        //   401: astore          7
        //   403: goto            152
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  116    152    401    406    Ljava/util/MissingResourceException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public static <T> T[] J(final T[] array, final int n) {
        omy.g(n <= array.length);
        return Arrays.copyOf(array, n);
    }
    
    public static long K(String s) throws ParserException {
        final Matcher matcher = cnw.g.matcher(s);
        if (!matcher.matches()) {
            s = String.valueOf(s);
            if (s.length() != 0) {
                s = "Invalid date/time format: ".concat(s);
            }
            else {
                s = new String("Invalid date/time format: ");
            }
            throw ParserException.a(s, (Throwable)null);
        }
        s = matcher.group(9);
        int n = 0;
        if (s != null) {
            if (!matcher.group(9).equalsIgnoreCase("Z")) {
                final int n2 = n = Integer.parseInt(matcher.group(13)) + Integer.parseInt(matcher.group(12)) * 60;
                if ("-".equals(matcher.group(11))) {
                    n = n2 * -1;
                }
            }
        }
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty((CharSequence)matcher.group(8))) {
            s = String.valueOf(matcher.group(8));
            if (s.length() != 0) {
                s = "0.".concat(s);
            }
            else {
                s = new String("0.");
            }
            gregorianCalendar.set(14, new BigDecimal(s).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (n != 0) {
            timeInMillis -= n * 60000;
        }
        return timeInMillis;
    }
    
    public static boolean L(final Handler handler, final Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }
    
    public static <T> void M(final List<T> list, final int n, final int n2) {
        if (n >= 0 && n2 <= list.size() && n <= n2) {
            if (n != n2) {
                list.subList(n, n2).clear();
            }
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static long N(final long n, final long n2, final long n3) {
        final long n4 = lcmp(n3, n2);
        if (n4 >= 0 && n3 % n2 == 0L) {
            return n / (n3 / n2);
        }
        if (n4 < 0 && n2 % n3 == 0L) {
            return n2 / n3 * n;
        }
        return (long)(n * (n2 / (double)n3));
    }
    
    public static void O(final long[] array, long n) {
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        final long n4 = lcmp(n, 1000000L);
        if (n4 >= 0 && n % 1000000L == 0L) {
            n /= 1000000L;
            while (i < array.length) {
                array[i] /= n;
                ++i;
            }
        }
        else if (n4 < 0 && 1000000L % n == 0L) {
            n = 1000000L / n;
            for (int j = n2; j < array.length; ++j) {
                array[j] *= n;
            }
        }
        else {
            final double n5 = 1000000L / (double)n;
            for (int k = n3; k < array.length; ++k) {
                array[k] *= (long)n5;
            }
        }
    }
    
    public static String[] P(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return new String[0];
        }
        return s.trim().split("(\\s*,\\s*)", -1);
    }
    
    public static ComponentName Q(final Context context, final Intent intent) {
        if (cnw.a >= 26) {
            return context.startForegroundService(intent);
        }
        return context.startService(intent);
    }
    
    public static byte[] R(final InputStream inputStream) throws IOException {
        final byte[] array = new byte[4096];
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    public static long S(final int n) {
        return (long)n & 0xFFFFFFFFL;
    }
    
    public static long T(final long n) {
        long n2 = n;
        if (n != -9223372036854775807L) {
            if (n == Long.MIN_VALUE) {
                n2 = n;
            }
            else {
                n2 = n / 1000L;
            }
        }
        return n2;
    }
    
    public static boolean a(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            equals = (o2 == null);
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    public static int b(final long[] array, final long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        if (n2 < 0) {
            binarySearch = ~n2;
        }
        else {
            while (++binarySearch < array.length && array[binarySearch] == n) {}
            if (b) {
                --binarySearch;
            }
        }
        return binarySearch;
    }
    
    public static int c(final lbg lbg, final long n) {
        int n2 = lbg.a - 1;
        final int n3 = 0;
        int i = 0;
        while (i <= n2) {
            final int n4 = i + n2 >>> 1;
            if (lbg.b(n4) < n) {
                i = n4 + 1;
            }
            else {
                n2 = n4 - 1;
            }
        }
        final int n5 = n2 + 1;
        if (n5 < lbg.a && lbg.b(n5) == n) {
            n2 = n5;
        }
        else if (n2 == -1) {
            n2 = n3;
        }
        return n2;
    }
    
    public static <T extends Comparable<? super T>> int d(final List<? extends Comparable<? super T>> list, final T t, final boolean b, final boolean b2) {
        int binarySearch;
        final int n = binarySearch = Collections.binarySearch(list, t);
        if (n < 0) {
            binarySearch = -(n + 2);
        }
        else {
            while (--binarySearch >= 0 && ((Comparable)list.get(binarySearch)).compareTo(t) == 0) {}
            ++binarySearch;
        }
        int max = binarySearch;
        if (b) {
            max = Math.max(0, binarySearch);
        }
        return max;
    }
    
    public static int e(final int[] array, int n) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        if (n2 < 0) {
            n = -(n2 + 2);
        }
        else {
            while (--binarySearch >= 0 && array[binarySearch] == n) {}
            n = binarySearch;
        }
        return n;
    }
    
    public static int f(final long[] array, final long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        if (n2 < 0) {
            binarySearch = -(n2 + 2);
        }
        else {
            while (--binarySearch >= 0 && array[binarySearch] == n) {}
            ++binarySearch;
        }
        int max = binarySearch;
        if (b) {
            max = Math.max(0, binarySearch);
        }
        return max;
    }
    
    public static void g(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static float h(final float n, final float n2, final float n3) {
        return Math.max(n2, Math.min(n, n3));
    }
    
    public static int i(final int n, final int n2, final int n3) {
        return Math.max(n2, Math.min(n, n3));
    }
    
    public static long j(final long n, final long n2, final long n3) {
        return Math.max(n2, Math.min(n, n3));
    }
    
    public static boolean k(final Object[] array, final Object o) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (a(array[i], o)) {
                return true;
            }
        }
        return false;
    }
    
    public static Handler l() {
        final Looper myLooper = Looper.myLooper();
        omy.m((Object)myLooper);
        return new Handler(myLooper, (Handler$Callback)null);
    }
    
    public static String m(final String s, final Object... array) {
        return String.format(Locale.US, s, array);
    }
    
    public static String n(final byte[] array) {
        return new String(array, it3.c);
    }
    
    public static String o(final byte[] array, final int n, final int n2) {
        return new String(array, n, n2, it3.c);
    }
    
    public static int p(int a) {
        switch (a) {
            default: {
                return 0;
            }
            case 8: {
                a = cnw.a;
                if (a >= 23) {
                    return 6396;
                }
                if (a >= 21) {
                    return 6396;
                }
                return 0;
            }
            case 7: {
                return 1276;
            }
            case 6: {
                return 252;
            }
            case 5: {
                return 220;
            }
            case 4: {
                return 204;
            }
            case 3: {
                return 28;
            }
            case 2: {
                return 12;
            }
            case 1: {
                return 4;
            }
        }
    }
    
    public static int q(final String s, final int n) {
        final String[] p2 = P(s);
        final int length = p2.length;
        int i = 0;
        int n2 = 0;
        while (i < length) {
            int n3 = n2;
            if (n == bbh.h(bbh.d(p2[i]))) {
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        return n2;
    }
    
    public static String r(String string, final int n) {
        final String[] p2 = P(string);
        final int length = p2.length;
        string = null;
        if (length == 0) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (final String s : p2) {
            if (n == bbh.h(bbh.d(s))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(s);
            }
        }
        if (sb.length() > 0) {
            string = sb.toString();
        }
        return string;
    }
    
    public static Point s(Context context) {
        final int a = cnw.a;
        Display display = null;
        Label_0036: {
            if (a >= 17) {
                final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
                if (displayManager != null) {
                    display = displayManager.getDisplay(0);
                    break Label_0036;
                }
            }
            display = null;
        }
        Display defaultDisplay = display;
        if (display == null) {
            final WindowManager windowManager = (WindowManager)context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            defaultDisplay = windowManager.getDefaultDisplay();
        }
        if (defaultDisplay.getDisplayId() == 0 && G(context)) {
            String s;
            if (a < 28) {
                s = B("sys.display-size");
            }
            else {
                s = B("vendor.display-size");
            }
            if (!TextUtils.isEmpty((CharSequence)s)) {
                try {
                    final String[] split = s.trim().split("x", -1);
                    if (split.length == 2) {
                        final int int1 = Integer.parseInt(split[0]);
                        final int int2 = Integer.parseInt(split[1]);
                        if (int1 > 0 && int2 > 0) {
                            context = (Context)new Point(int1, int2);
                            return (Point)context;
                        }
                    }
                }
                catch (final NumberFormatException ex) {}
                final String value = String.valueOf(s);
                String concat;
                if (value.length() != 0) {
                    concat = "Invalid display size: ".concat(value);
                }
                else {
                    concat = new String("Invalid display size: ");
                }
                Log.e("Util", concat);
            }
            if ("Sony".equals(cnw.c) && cnw.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                context = (Context)new Point(3840, 2160);
                return (Point)context;
            }
        }
        context = (Context)new Point();
        final int a2 = cnw.a;
        if (a2 >= 23) {
            final Display$Mode mode = defaultDisplay.getMode();
            ((Point)context).x = mode.getPhysicalWidth();
            ((Point)context).y = mode.getPhysicalHeight();
        }
        else if (a2 >= 17) {
            defaultDisplay.getRealSize((Point)context);
        }
        else {
            defaultDisplay.getSize((Point)context);
        }
        return (Point)context;
    }
    
    public static Looper t() {
        Looper looper = Looper.myLooper();
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        return looper;
    }
    
    public static int u(final int n) {
        if (n != 2 && n != 4) {
            if (n != 10) {
                if (n != 7) {
                    if (n != 8) {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        return 6006;
                                    }
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28: {
                                        return 6002;
                                    }
                                }
                                break;
                            }
                            case 15: {
                                break;
                            }
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22: {
                                return 6004;
                            }
                            case 16:
                            case 18: {
                                return 6005;
                            }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }
    
    public static long v(final long n, final float n2) {
        if (n2 == 1.0f) {
            return n;
        }
        return Math.round(n * (double)n2);
    }
    
    public static int w(final int n) {
        if (n == 8) {
            return 3;
        }
        if (n == 16) {
            return 2;
        }
        if (n == 24) {
            return 536870912;
        }
        if (n != 32) {
            return 0;
        }
        return 805306368;
    }
    
    public static int x(final int n, final int n2) {
        if (n != 2) {
            int n3 = n2;
            if (n != 3) {
                if (n != 4) {
                    if (n == 268435456) {
                        return n2 * 2;
                    }
                    if (n == 536870912) {
                        return n2 * 3;
                    }
                    if (n != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
                n3 = n2 * 4;
            }
            return n3;
        }
        return n2 * 2;
    }
    
    public static long y(final long n, final float n2) {
        if (n2 == 1.0f) {
            return n;
        }
        return Math.round(n / (double)n2);
    }
    
    public static int z(final int n) {
        if (n == 13) {
            return 1;
        }
        switch (n) {
            default: {
                return 3;
            }
            case 6: {
                return 2;
            }
            case 5:
            case 7:
            case 8:
            case 9:
            case 10: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 0;
            }
        }
    }
    
    private static long[] $d2j$hex$fcd2dfd9$decode_J(final String src) {
        final byte[] d = $d2j$hex$fcd2dfd9$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final LongBuffer s = b.asLongBuffer();
        final long[] data = new long[d.length / 8];
        s.get(data);
        return data;
    }
    
    private static int[] $d2j$hex$fcd2dfd9$decode_I(final String src) {
        final byte[] d = $d2j$hex$fcd2dfd9$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final IntBuffer s = b.asIntBuffer();
        final int[] data = new int[d.length / 4];
        s.get(data);
        return data;
    }
    
    private static short[] $d2j$hex$fcd2dfd9$decode_S(final String src) {
        final byte[] d = $d2j$hex$fcd2dfd9$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final ShortBuffer s = b.asShortBuffer();
        final short[] data = new short[d.length / 2];
        s.get(data);
        return data;
    }
    
    private static byte[] $d2j$hex$fcd2dfd9$decode_B(final String src) {
        final char[] d = src.toCharArray();
        final byte[] ret = new byte[src.length() / 2];
        for (int i = 0; i < ret.length; ++i) {
            final char h = d[2 * i];
            final char l = d[2 * i + 1];
            int hh;
            if (h >= '0' && h <= '9') {
                hh = h - '0';
            }
            else if (h >= 'a' && h <= 'f') {
                hh = h - 'a' + 10;
            }
            else {
                if (h < 'A' || h > 'F') {
                    throw new RuntimeException();
                }
                hh = h - 'A' + 10;
            }
            int ll;
            if (l >= '0' && l <= '9') {
                ll = l - '0';
            }
            else if (l >= 'a' && l <= 'f') {
                ll = l - 'a' + 10;
            }
            else {
                if (l < 'A' || l > 'F') {
                    throw new RuntimeException();
                }
                ll = l - 'A' + 10;
            }
            ret[i] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}
