package iview.wsienski.kotlintrip.domain.mapper;

import java.util.ArrayList;
import java.util.List;

import iview.wsienski.kotlintrip.domain.data.RepoJava;

/**
 * Created by WSienski on 27/12/2017.
 */

public class RepoMapper {

    public List<RepoJava> convertFromDataModelToDomain(List<iview.wsienski.kotlintrip.data.data.RepoJava> list) {
        List<RepoJava> repos = new ArrayList<>();

        for (iview.wsienski.kotlintrip.data.data.RepoJava repoJava : list) {
            repos.add(convertRepoToDomain(repoJava));
        }

        return repos;
    }

    private RepoJava convertRepoToDomain(iview.wsienski.kotlintrip.data.data.RepoJava repoJava) {
        return new RepoJava(repoJava.getName(), repoJava.getOwner().getLogin());
    }
}
