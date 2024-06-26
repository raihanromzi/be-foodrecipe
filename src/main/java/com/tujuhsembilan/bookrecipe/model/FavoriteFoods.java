package com.tujuhsembilan.bookrecipe.model;
// Generated Jan 4, 2024, 3:00:37 PM by Hibernate Tools 6.3.1.Final

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;

/**
 * FavoriteFoods generated by hbm2java
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class FavoriteFoods implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3546210349609347528L;

	@EmbeddedId
    private FavoriteFoodsId id;

    @MapsId("userId")
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @MapsId("recipeId")
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipes recipes;

    @Column(name = "is_favorite")
    private Boolean isFavorite;

    @Column(name = "created_by")
    private String createdBy;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_time", length = 29)
    private Timestamp createdTime;

    @Column(name = "modified_by")
    private String modifiedBy;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_time", length = 29)
    private Timestamp modifiedTime;
}