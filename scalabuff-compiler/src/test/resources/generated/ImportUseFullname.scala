// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: import_use_fullname.proto

package resources.generated

//import "package_name.proto"

final case class UseFullImportedName (
	`fullnameTest`: resources.generated.nested.PackageTest = resources.generated.nested.PackageTest.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[UseFullImportedName]
	with net.sandrogrzicic.scalabuff.Parser[UseFullImportedName] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `fullnameTest`)
	}

	def getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, `fullnameTest`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): UseFullImportedName = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __fullnameTest: resources.generated.nested.PackageTest = resources.generated.nested.PackageTest.defaultInstance

		def __newMerged = UseFullImportedName(
			__fullnameTest
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __fullnameTest = readMessage[resources.generated.nested.PackageTest](in, __fullnameTest, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: UseFullImportedName) = {
		UseFullImportedName(
			m.`fullnameTest`
		)
	}

	def getDefaultInstanceForType = UseFullImportedName.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
	def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
}

object UseFullImportedName {
	@reflect.BeanProperty val defaultInstance = new UseFullImportedName()

	def parseFrom(data: Array[Byte]): UseFullImportedName = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): UseFullImportedName = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): UseFullImportedName = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): UseFullImportedName = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[UseFullImportedName] = defaultInstance.mergeDelimitedFromStream(stream)

	val FULLNAME_TEST_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: UseFullImportedName) = defaultInstance.mergeFrom(prototype)

}

object ImportUseFullname {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

	private val fromBinaryHintMap = collection.immutable.HashMap[String, Array[Byte] ⇒ com.google.protobuf.GeneratedMessageLite](
		 "UseFullImportedName" -> (bytes ⇒ UseFullImportedName.parseFrom(bytes))
	)

	def deserializePayload(payload: Array[Byte], payloadType: String): com.google.protobuf.GeneratedMessageLite = {
		fromBinaryHintMap.get(payloadType) match {
			case Some(f) ⇒ f(payload)
			case None    ⇒ throw new IllegalArgumentException(s"unimplemented deserialization of message payload of type [${payloadType}]")
		}
	}
}
