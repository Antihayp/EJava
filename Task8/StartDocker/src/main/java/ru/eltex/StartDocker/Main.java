package ru.eltex.StartDocker;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.core.DockerClientBuilder;
import java.util.List;

public class Main
{
	public static void main(String[] argv) {
		DockerClient dockerClient = DockerClientBuilder.getInstance().build();

		List<Container> containers = dockerClient.listContainersCmd().exec();

		for (Container con : containers) {
			System.out.println(con);
		}

//		containers.forEach((a) -> System.out.println(a));
	}
}