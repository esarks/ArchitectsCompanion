//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by jni4net. See http://jni4net.sourceforge.net/ 
//     Runtime Version:2.0.50727.4952
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace org.drools.builder {
    
    
    #region Component Designer generated code 
    [global::net.sf.jni4net.attributes.JavaClassAttribute()]
    public partial class ResourceType : global::java.lang.Object, global::java.io.Serializable {
        
        internal new static global::java.lang.Class staticClass;
        
        internal static global::net.sf.jni4net.jni.MethodId _getName0;
        
        internal static global::net.sf.jni4net.jni.MethodId _getResourceType1;
        
        internal static global::net.sf.jni4net.jni.MethodId _addResourceTypeToRegistry2;
        
        internal static global::net.sf.jni4net.jni.MethodId _determineResourceType3;
        
        internal static global::net.sf.jni4net.jni.MethodId _matchesExtension4;
        
        internal static global::net.sf.jni4net.jni.MethodId _getDefaultExtension5;
        
        internal static global::net.sf.jni4net.jni.MethodId _getDescription6;
        
        internal static global::net.sf.jni4net.jni.FieldId _DRL7;
        
        internal static global::net.sf.jni4net.jni.FieldId _XDRL8;
        
        internal static global::net.sf.jni4net.jni.FieldId _DSL9;
        
        internal static global::net.sf.jni4net.jni.FieldId _DSLR10;
        
        internal static global::net.sf.jni4net.jni.FieldId _DRF11;
        
        internal static global::net.sf.jni4net.jni.FieldId _BPMN212;
        
        internal static global::net.sf.jni4net.jni.FieldId _DTABLE13;
        
        internal static global::net.sf.jni4net.jni.FieldId _PKG14;
        
        internal static global::net.sf.jni4net.jni.FieldId _BRL15;
        
        internal static global::net.sf.jni4net.jni.FieldId _CHANGE_SET16;
        
        internal static global::net.sf.jni4net.jni.FieldId _XSD17;
        
        internal static global::net.sf.jni4net.jni.MethodId @__ctorResourceType18;
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")]
        public ResourceType(global::java.lang.String par0, global::java.lang.String par1, global::java.lang.String par2) : 
                base(((global::net.sf.jni4net.jni.JNIEnv)(null))) {
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 16)){
            @__env.NewObject(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType.@__ctorResourceType18, this, global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par0), global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par1), global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par2));
            }
        }
        
        protected ResourceType(global::net.sf.jni4net.jni.JNIEnv @__env) : 
                base(@__env) {
        }
        
        public static global::java.lang.Class _class {
            get {
                return global::org.drools.builder.ResourceType.staticClass;
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType DRL {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._DRL7));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType XDRL {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._XDRL8));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType DSL {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._DSL9));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType DSLR {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._DSLR10));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType DRF {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._DRF11));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType BPMN2 {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._BPMN212));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType DTABLE {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._DTABLE13));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType PKG {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._PKG14));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType BRL {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._BRL15));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType CHANGE_SET {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._CHANGE_SET16));
            }
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType XSD {
            get {
                global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
                return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.GetStaticObjectFieldPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._XSD17));
            }
            }
        }
        
        private static void InitJNI(global::net.sf.jni4net.jni.JNIEnv @__env, java.lang.Class @__class) {
            global::org.drools.builder.ResourceType.staticClass = @__class;
            global::org.drools.builder.ResourceType._getName0 = @__env.GetMethodID(global::org.drools.builder.ResourceType.staticClass, "getName", "()Ljava/lang/String;");
            global::org.drools.builder.ResourceType._getResourceType1 = @__env.GetStaticMethodID(global::org.drools.builder.ResourceType.staticClass, "getResourceType", "(Ljava/lang/String;)Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._addResourceTypeToRegistry2 = @__env.GetStaticMethodID(global::org.drools.builder.ResourceType.staticClass, "addResourceTypeToRegistry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/drools/builder/Resou" +
                    "rceType;");
            global::org.drools.builder.ResourceType._determineResourceType3 = @__env.GetStaticMethodID(global::org.drools.builder.ResourceType.staticClass, "determineResourceType", "(Ljava/lang/String;)Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._matchesExtension4 = @__env.GetMethodID(global::org.drools.builder.ResourceType.staticClass, "matchesExtension", "(Ljava/lang/String;)Z");
            global::org.drools.builder.ResourceType._getDefaultExtension5 = @__env.GetMethodID(global::org.drools.builder.ResourceType.staticClass, "getDefaultExtension", "()Ljava/lang/String;");
            global::org.drools.builder.ResourceType._getDescription6 = @__env.GetMethodID(global::org.drools.builder.ResourceType.staticClass, "getDescription", "()Ljava/lang/String;");
            global::org.drools.builder.ResourceType._DRL7 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "DRL", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._XDRL8 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "XDRL", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._DSL9 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "DSL", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._DSLR10 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "DSLR", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._DRF11 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "DRF", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._BPMN212 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "BPMN2", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._DTABLE13 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "DTABLE", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._PKG14 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "PKG", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._BRL15 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "BRL", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._CHANGE_SET16 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "CHANGE_SET", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType._XSD17 = @__env.GetStaticFieldID(global::org.drools.builder.ResourceType.staticClass, "XSD", "Lorg/drools/builder/ResourceType;");
            global::org.drools.builder.ResourceType.@__ctorResourceType18 = @__env.GetMethodID(global::org.drools.builder.ResourceType.staticClass, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/String;")]
        public virtual global::java.lang.String getName() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2CpString(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.builder.ResourceType._getName0));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Ljava/lang/String;)Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType getResourceType(global::java.lang.String par0) {
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 12)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.CallStaticObjectMethodPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._getResourceType1, global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par0)));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/drools/builder/Resou" +
            "rceType;")]
        public static global::org.drools.builder.ResourceType addResourceTypeToRegistry(global::java.lang.String par0, global::java.lang.String par1, global::java.lang.String par2) {
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 16)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.CallStaticObjectMethodPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._addResourceTypeToRegistry2, global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par0), global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par1), global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par2)));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Ljava/lang/String;)Lorg/drools/builder/ResourceType;")]
        public static global::org.drools.builder.ResourceType determineResourceType(global::java.lang.String par0) {
            global::net.sf.jni4net.jni.JNIEnv @__env = global::net.sf.jni4net.jni.JNIEnv.ThreadEnv;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 12)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2Cp<global::org.drools.builder.ResourceType>(@__env, @__env.CallStaticObjectMethodPtr(global::org.drools.builder.ResourceType.staticClass, global::org.drools.builder.ResourceType._determineResourceType3, global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par0)));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("(Ljava/lang/String;)Z")]
        public virtual bool matchesExtension(global::java.lang.String par0) {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 12)){
            return ((bool)(@__env.CallBooleanMethod(this, global::org.drools.builder.ResourceType._matchesExtension4, global::net.sf.jni4net.utils.Convertor.ParStrongCp2J(par0))));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/String;")]
        public virtual global::java.lang.String getDefaultExtension() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2CpString(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.builder.ResourceType._getDefaultExtension5));
            }
        }
        
        [global::net.sf.jni4net.attributes.JavaMethodAttribute("()Ljava/lang/String;")]
        public virtual global::java.lang.String getDescription() {
            global::net.sf.jni4net.jni.JNIEnv @__env = this.Env;
            using(new global::net.sf.jni4net.jni.LocalFrame(@__env, 10)){
            return global::net.sf.jni4net.utils.Convertor.StrongJ2CpString(@__env, @__env.CallObjectMethodPtr(this, global::org.drools.builder.ResourceType._getDescription6));
            }
        }
        
        new internal sealed class ContructionHelper : global::net.sf.jni4net.utils.IConstructionHelper {
            
            public global::net.sf.jni4net.jni.IJvmProxy CreateProxy(global::net.sf.jni4net.jni.JNIEnv @__env) {
                return new global::org.drools.builder.ResourceType(@__env);
            }
        }
    }
    #endregion
}
