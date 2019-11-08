package correios;

import java.io.IOException;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;

public class TesteGetCorreios {

	public static void main(String[] args) throws IOException {
		HttpRequestFactory requestFactory = new NetHttpTransport().createRequestFactory();
		HttpRequest request = requestFactory.buildGetRequest(new GenericUrl("http://correios.postmon.com.br/webservice/buscaEventos/?objetos=PN876436923BR"));
		String rawResponse = request.execute().parseAsString();

		System.out.println(rawResponse);
	}

}
